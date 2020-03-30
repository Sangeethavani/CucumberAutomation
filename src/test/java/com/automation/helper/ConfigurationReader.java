package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public  ConfigurationReader() throws IOException {

		File f = new File("C:\\Users\\kokil\\eclipse-workspace\\CucumberAutomation\\src\\test\\java\\com\\automation\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public static String getBrowserName() {

		String browsername = p.getProperty("browsername");
		return browsername;

	}

	public static String geturl() {
		String geturl = p.getProperty("url");
		return geturl;

	}
	
		
	

}
