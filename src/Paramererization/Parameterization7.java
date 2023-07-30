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

public class Parameterization7 {

	public static String readexcelsheet(int row , int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	
	         public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	        	 System.out.println(readexcelsheet(1,0));
	        	 
	        	 System.out.println(readexcelsheet(1,1));
	        	 
	        	 System.out.println(readexcelsheet(1,2));
	        	 
	        	 
	        System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);	 
	        	 
	        	 WebDriver driver = new ChromeDriver();
	        	 
	        	 driver.get("https://en-gb.facebook.com/reg/");
	        	 
	        	 driver.manage().window().maximize();
	        	 
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys((readexcelsheet(1,0)));
	     
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys((readexcelsheet(1,1)));
	     
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys((readexcelsheet(1,2)));
	        	 
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys((readexcelsheet(1,2)));
	}
	
	
	
	
	
	
	
}
//""