package org.properties.com;

import java.io.FileReader;
import java.util.Properties;

public class Prop {
	private static Properties prop;

	public static void setupProperties() throws Exception {
		try {
			FileReader file = new FileReader(".\\src\\main\\resources\\application_configuration\\config.properties");
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			System.out.println("in Setup Properties Methods");
			System.out.println(e);
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
