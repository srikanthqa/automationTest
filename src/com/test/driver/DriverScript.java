package com.test.driver;

import com.test.java.*;

public class DriverScript 
{
	public static void main (String args[])
	{
		ReadProperties read = new ReadProperties();
		ExcelReadWrite1 xlread = new ExcelReadWrite1();
		InvokeAppium ia = new InvokeAppium();
		AccessEmulator ae = new AccessEmulator();
		try
		{
			ia.StartAppium();
//			ia.StopAppium();
			
	//		ae.StartEmulator();
//			ae.StopEmulator();
			
/*			String testsuitepath = read.readFile("testsuitepath"); ;
			System.out.println("The Testsuite path: "+testsuitepath);
			String sheetname = "Choose_Device";
			xlread.readExcel(testsuitepath, sheetname);*/
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
