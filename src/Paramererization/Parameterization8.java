package Paramererization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Parameterization8 {

	public static String readdata(int row , int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(File).getSheet("sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
		
	}
	
	      public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    	  
	    	  
	    	  System.out.println(readdata(1,0));
	    	  
	    	  System.out.println(readdata(1,2));
	    	  
	    	  
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys(readdata(1,0));
		   
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(readdata(1,1));
		   
		   driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
//""