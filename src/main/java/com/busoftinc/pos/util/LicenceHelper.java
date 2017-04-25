package com.busoftinc.pos.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.openbravo.pos.forms.StartPOS;

public class LicenceHelper {
	private boolean isTrial = false;
	private boolean endSubscription = false;
	private String subValidTo = "TRIAL 30 HARI";
	private String message = "OK";
	
	public String getMessage(){
		return this.message;
	}

	public boolean isEndSubscription() {
		return this.endSubscription;
	}
	
	public String getSubValidTo(){
		return this.subValidTo;
	}

	public boolean getIsTrial() {
		return this.isTrial;
	}
	
	public boolean isLegal(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date today = Calendar.getInstance().getTime();
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.DATE, 31); //minus number would decrement the days
		String command = "TRIAL;"+sdf.format(cal.getTime());
		String lic = getLic();
		if (("E".equalsIgnoreCase(lic)) || ("".equalsIgnoreCase(lic))){
			this.message = "OKTRIAL";
			setLic(command);
			return true;
		}else{
			String[] lic_content = lic.split(";");
			//trial
			if ("trial".equalsIgnoreCase(lic_content[0])){
				try{
					Date trialEnd = sdf.parse(lic_content[1]);
					this.subValidTo = sdf.format(trialEnd);
					if (trialEnd.compareTo(today)>0){
						this.message = "OKTRIAL";
						return true;
					}else{
						this.message = "Masa Trial sudah Habis pada " + lic_content[1];
						return false;
					}
				}catch(Exception e){
					this.message = "Error Occured when Validating Trial Period";
					return false;
				}
			}//non trial
			else{
				String full_licence = lic_content[1];
				try{
					full_licence = CryptoUtils.decMy(full_licence);
					String [] arrLic = full_licence.split("\\|");
					Date subEnd = sdf.parse(arrLic[2]);
					this.subValidTo = sdf.format(subEnd);
					//validate key
					if (arrLic[1].equalsIgnoreCase(DiskUtils.getUid().trim())){
						if (subEnd.compareTo(today)>0){
							return true;
						}else{
							this.message = "Masa berlangganan anda Habis";
							return false;
						}
					}else{
						this.message = "Licence key tidak valid ";
						return false;
					}
				}catch(Exception e){
					this.message = "Error Occured when Validating Full Licence";
					return false;
				}
			}
		}
	}


	public boolean isLicContentTrue(String f) {
		boolean result = false;
		BufferedReader br = null;
		try {
			// System.out.println("CryptoUtils.decMy(f) " +
			// CryptoUtils.decMy(f));
			// System.out.println("DiskUtils.getUid() " + DiskUtils.getUid());
			String licenceString = CryptoUtils.decMy(f).trim();
			if (licenceString.startsWith("SUBS")) {
				if (licenceString.split("\\|")[1].equalsIgnoreCase(DiskUtils.getUid().trim())) {
					result = true;
				}
			} else {
				if (licenceString.equalsIgnoreCase(DiskUtils.getUid().trim())) {
					result = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {

			}
		}
		return result;
	}

	public boolean writeLicence(String licence) {
		boolean result = false;

		try {
			setLic("FULL;"+licence);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	private static String setLic(String lic) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.DATE, 31); //minus number would decrement the days
		//String command = "REG ADD HKLM\\SOFTWARE\\BPOS\\ /v LIC  /t REG_SZ /d TRIAL;"+new SimpleDateFormat("yyyyMMdd").format(cal.getTime()) +" /f";
        String command = "REG ADD HKLM\\SOFTWARE\\BPOS\\ /v LIC  /t REG_SZ /d "+ lic +" /f";
		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line = "E";
			while ((line = reader.readLine()) != null) {
				if (line.trim().startsWith("LIC")) {
					output.append(line.trim().replace(" ", "").split("REG_SZ")[1] + "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return output.toString();

	}
	
	private String getLic() {

		String command = "REG QUERY HKEY_LOCAL_MACHINE\\SOFTWARE\\BPOS";
		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line = "E";
			System.out.println("reader.readLine() " + reader.readLine());
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				if (line.trim().startsWith("LIC")) {
					output.append(line.trim().replace(" ", "").split("REG_SZ")[1] + "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(output.toString());
		return output.toString();

	}
}
