package Testing1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Configuration.ConfigurationPath;

public class Setup3 {

	public static String readexceldata(int row , int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(File).getSheet("Sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
		
		
		
		
	}
	
	public static void Screenshot(WebDriver driver) throws IOException {
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		String str = d.toString().replace(":", "_");
		
		
		 File Dest = new File("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\" +str+"image.jpg");
		
		
		FileHandler.copy(Source, Dest);
		
		
		
		
	}
	
	
	
	
}
//""