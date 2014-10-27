package com.test.java;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReadWrite1 
{
	public void readExcel(String path, String sheetname)
	{
		try
		{
			InputStream input = new FileInputStream(path);
			HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(input));
			HSSFSheet sheet = workbook.getSheet(sheetname);
			
			Iterator<Row> rowIterator= sheet.iterator();
			
		}
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeExcel(String path)
	{
		try
		{
			
		}
		catch (Exception e)
		{
			
		}
		
	}
}
