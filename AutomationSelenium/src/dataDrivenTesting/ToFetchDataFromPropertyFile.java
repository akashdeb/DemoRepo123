package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/propertData.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String urlFromPropertyFile = property.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String usernameFromPropertyFile = property.getProperty("username");
		System.out.println(usernameFromPropertyFile);
		
		String passwordFromPropertyFile = property.getProperty("password");
		System.out.println(passwordFromPropertyFile);
	}

}
