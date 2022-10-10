package com.nuna.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties prop;

	/**
	 * This method reads the properties file
	 * 
	 * @param filePath
	 */
	public static void readProperties(String filePath) {

		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method returns the value for a specific key
	 * 
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		String value = prop.getProperty(key);
		return value;
	}

}
