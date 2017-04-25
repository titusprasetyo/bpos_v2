package com.busoftinc.pos.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {

		//setLic();
		String output = getLic();

		System.out.println(output);

	}
	private static String setLic() {

        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.DATE, 31); //minus number would decrement the days
		String command = "REG ADD HKLM\\SOFTWARE\\BPOS\\ /v LIC  /t REG_SZ /d TRIAL;"+new SimpleDateFormat("yyyyMMdd").format(cal.getTime()) +" /f";
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
	
	private static String getLic() {

		String command = "REG QUERY HKEY_LOCAL_MACHINE\\SOFTWARE\\BPOS";
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
}
