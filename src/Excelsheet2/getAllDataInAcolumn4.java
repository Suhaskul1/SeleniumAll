package Excelsheet2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInAcolumn4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  
	  int lastrowindex = sh.getLastRowNum();
	  
	  for(int i=0; i<=lastrowindex; i++)
	  {
		  String value = sh.getRow(i).getCell(2).getStringCellValue();
		  System.out.println(value);
	  }
	  System.out.println();
	  getAllDataInAcolumn4 gd=new getAllDataInAcolumn4();
	  gd.m2();
	}
	
	public void m2() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex; i++)
		{
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
	}
}
