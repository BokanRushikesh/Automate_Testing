package Listners;

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

public class Demo3 {

	public static String readdata(int row,int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		 Sheet sht = WorkbookFactory.create(File).getSheet("sheet1");
		 
		 String data = sht.getRow(row).getCell(coll).getStringCellValue();
		 
		 return data;
	}
	
	public static void ScreenShot(WebDriver driver,String tcid) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		String str = d.toString().replace(":", "_");
		
	     File dest = new File(ConfigurationPath.Screenshot+str+tcid+"image.jpg");
	     
	     FileHandler.copy(source, dest);
	}
}
//""