package com.busoftinc.pos.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DiskUtils {
	public static String getUid() {
		String result = "";
		Process p = null;
		InputStream is = null;
		BufferedReader br = null;
		try {
			p = Runtime.getRuntime().exec("wmic diskdrive get serialnumber");
			is = p.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			List<String> list = new ArrayList<>();
			String line = "test";
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			for (int i = 0; i < list.size(); i++) {
				if (i == 2)
					result = list.get(i);
			}
			result = CryptoUtils.getMd5Digest(result.trim());
		} catch (Exception e) {
			result = "";
		} finally {
			try {
				br.close();
				is.close();
			} catch (IOException e) {

			}
		}
		return result;
	}
}
