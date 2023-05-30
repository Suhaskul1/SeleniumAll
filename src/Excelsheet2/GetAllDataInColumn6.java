package Excelsheet2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInColumn6 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex; i++)
		{
			 String text = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(text);
		}
	}
}
