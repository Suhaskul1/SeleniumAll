package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetColumnSizeInRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\JavaExcel.xlsx");
	  
	  short colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	  
	  System.out.println(colsize);
	}
}
