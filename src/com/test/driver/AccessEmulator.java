package com.test.driver;

import java.io.File;

public class AccessEmulator 
{
	static String emulatorpath = "D:\\AutomationRnDWorkspace\\AutomationFramework\\src\\com\\test\\driver\\StartEmulator.bat";
	static File file = new File(emulatorpath);
	Process emulator;
	public void StartEmulator()
	{
		System.out.println("Initiating Emulator launch");
		try
		{
			System.out.println("Verifying batch file");
			
			if (! file.exists()) 
			{
			   System.out.println("File not found in specified path");
			}
			else
			{
				System.out.println("Launching Emulator...");
				emulator = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/C", "Start", file.getAbsolutePath()});
				Thread.sleep(5000);
				System.out.println("Emulator Launched");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new IllegalArgumentException("The file " + emulator + " does not exist");
		}
	}
	
	public void StopEmulator()
	{
		try
		{
			System.out.println("Stopping Appium");
			emulator.exitValue();
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
			System.out.println("Appium Stoped");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
