package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibb {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commonfile.txt");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}