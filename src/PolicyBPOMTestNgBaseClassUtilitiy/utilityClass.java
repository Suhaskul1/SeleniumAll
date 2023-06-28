package PolicyBPOMTestNgBaseClassUtilitiy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityClass {

	//created by: suhas
	//This method use to get test data from excel sheet
	//need to pass 2 inputs: rowindex and colindex
	public static String getTestData(int rowIndex, int colIndex) throws  IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
	
	public static void CaptureSS(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\PracticeNotes\\JavaNotes\\Screenshot\\TestCaseID"+ TCID+".jpg");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
	public static String getPFData(String key) throws IOException, EncryptedDocumentException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SeleniumAll\\PropertiesPolicyB.properties");
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
}
