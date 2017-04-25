package com.busoftinc.pos.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class CryptoUtils {
	static byte[] salt = "indonesi".getBytes();//{ -87, -101, -56, 50, 86, 53, -29, 3 };
	static int iterationCount = 20;
	static String passPhrase = "busi_busi_busi_indonesia";
	
	public static void main(String[] r){
		try {
			System.out.println(getMd5Digest("TM8514GL1KZEKP"));
			System.out.println(getMd5Digest(""));
			System.out.println(encMy("72FFD70A2D64612E452FC138B09055CF"));
			System.out.println(decMy("VJBwxo5dh/Rb8ZVlQRHmtHK8b9d+Lo/hwTJdxwLqXn/VLtHBuYbSQw=="));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String encMy(String paramString) throws Exception {
		Object localObject = null;

		PBEKeySpec localPBEKeySpec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount);

		SecretKey localSecretKey = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(localPBEKeySpec);

		Cipher localCipher = Cipher.getInstance(localSecretKey.getAlgorithm());

		PBEParameterSpec localPBEParameterSpec = new PBEParameterSpec(salt, iterationCount);

		localCipher.init(1, localSecretKey, localPBEParameterSpec);

		byte[] arrayOfByte1 = paramString.getBytes("UTF8");

		byte[] arrayOfByte2 = localCipher.doFinal(arrayOfByte1);

		return new BASE64Encoder().encode(arrayOfByte2);
	}

	public static String decMy(String paramString) throws Exception {
		PBEKeySpec localPBEKeySpec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount);

		SecretKey localSecretKey = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(localPBEKeySpec);

		Cipher localCipher = Cipher.getInstance(localSecretKey.getAlgorithm());

		PBEParameterSpec localPBEParameterSpec = new PBEParameterSpec(salt, iterationCount);

		localCipher.init(2, localSecretKey, localPBEParameterSpec);
		byte[] arrayOfByte1 = new BASE64Decoder().decodeBuffer(paramString);

		byte[] arrayOfByte2 = localCipher.doFinal(arrayOfByte1);

		return new String(arrayOfByte2, "UTF8");
	}
	
	public static String getMd5Digest(String paramString)
	  {
	    try
	    {
	      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
	      byte[] arrayOfByte = localMessageDigest.digest(paramString.getBytes());
	      BigInteger localBigInteger = new BigInteger(1, arrayOfByte);
	      return localBigInteger.toString(16).toUpperCase();
	    }
	    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
	    {
	      throw new RuntimeException(localNoSuchAlgorithmException);
	    }
	  }
}
