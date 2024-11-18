package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		//properties file location
		
		FileInputStream file=new FileInputStream("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Day41_DDT\\config.properties");
		
		//loading properties file
		Properties prop=new Properties();
		prop.load(file);
		
		//reading properties file

		String url=prop.getProperty("AppURL");
		String username=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(pass);
		
		file.close();
		
		
		
	}

}
