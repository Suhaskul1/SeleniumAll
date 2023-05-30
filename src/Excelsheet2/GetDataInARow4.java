package Excelsheet2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataInARow4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
	  
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  
	  int lastcellindex = sh.getRow(0).getLastCellNum()-1;
	  for(int i=0; i<=lastcellindex; i++)
	  {
		  String value = sh.getRow(1).getCell(i).getStringCellValue();
		  
		  System.out.print(value+" ");
	  }
	  System.out.println();
	  GetDataInARow4 gd=new GetDataInARow4();
	  
	  gd.m1();
	}
	
	public void m1() throws EncryptedDocumentException, IOException
	{
		
		System.out.println("Method m1");
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastcellindex; i++)
		{
			String value = sh.getRow(2).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}
}
