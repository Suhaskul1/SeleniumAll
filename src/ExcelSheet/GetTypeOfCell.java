package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	  
	  CellType s1 = sh.getRow(0).getCell(2).getCellType();
	  
	  System.out.println(s1);
	}
}
