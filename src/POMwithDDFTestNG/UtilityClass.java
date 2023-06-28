package POMwithDDFTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {

	//@Author: Suhas
	//This method is use to get the data from excel
	//need to pass 2 inputs: 1- roIndex, 2-colIndex
	public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
}
