package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataByVerifyingTypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	  
	  Cell cellinfo = sh.getRow(3).getCell(1);
	  
	  CellType s1 = cellinfo.getCellType();
	  
	  if(s1==CellType.STRING)
	  {
		  String value = cellinfo.getStringCellValue();
		  
		  System.out.println(value);
	  }
	  else if(s1==CellType.NUMERIC)
	  {
		  double value = cellinfo.getNumericCellValue();
		  System.out.println(value);
	  }
	  else if(s1==CellType.BOOLEAN)
	  {
		  boolean value = cellinfo.getBooleanCellValue();
		  System.out.println(value);
	  }
	}
}
