package Excelsheet2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInRow5 {

	public static void main(String[] args) throws IOException
	{
	 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");	
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	 int lastcellindex = sh.getRow(0).getLastCellNum()-1;
	 for(int i=0; i<=lastcellindex; i++)
	 {
		 String res = sh.getRow(0).getCell(i).getStringCellValue();
		 System.out.print(res+" ");
	 }
	}
}
