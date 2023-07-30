package Framework;

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

public class utility1 {

	public static String readdata(int row , int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
	}
	
	public static void picture (WebDriver driver) throws IOException {
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date D = new Date();
		
		String str = D.toString().replace(":", "_");
		
		File dest = new File ("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\"+str+"image.jpg");
		
		FileHandler.copy(Source, dest);
	}
	
}
//""