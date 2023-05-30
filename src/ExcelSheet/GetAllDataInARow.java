package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInARow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");	
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  
	  int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
	  System.out.println(lastCellIndex);
	  
	  for(int i=0; i<=lastCellIndex; i++)
	  {
		  String value = sh.getRow(0).getCell(i).getStringCellValue();
		  
		  System.out.print(value+" ");
	  }
	}
}
