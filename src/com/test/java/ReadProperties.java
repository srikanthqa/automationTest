package com.test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties 
{
	public String readFile(String propName)
	{
		Properties prop = new Properties();
		String propValue = null;
		try
		{
			System.out.println("Start Reading properties file");
			InputStream input = new FileInputStream("src\\com\\test\\properties\\config.properties");
			prop.load(input);
			propValue = prop.getProperty(propName);
			System.out.println("Read Complete"); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
		}
		catch (IOException e)
		{
			System.out.println("Unable to read data from file");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return propValue;
	}

}
