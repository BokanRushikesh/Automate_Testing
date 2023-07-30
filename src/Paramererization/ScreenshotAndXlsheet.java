package Paramererization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import Configuration.ConfigurationPath;

public class ScreenshotAndXlsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(readdata(5,0));
		
		screenshot(driver);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(readdata(5,1));
		screenshot(driver);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(readdata(5,2));
		screenshot(driver);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(readdata(5,3));
		screenshot(driver);
	}
	
	public static void screenshot(WebDriver driver) throws IOException {
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 Date d = new Date();
		 
		  String str = d.toString().replace(":", "_");
		  
		  File dest = new File(ConfigurationPath.Screenshot+str+"image.jpg");
		  
		  FileHandler.copy(source, dest);
		 
	}
	
	public static String readdata(int row,int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		 Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		 
		 String data = sht.getRow(row).getCell(col).getStringCellValue();
		 
		 return data;
	}
}
//""