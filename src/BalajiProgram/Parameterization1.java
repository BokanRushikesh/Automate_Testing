package BalajiProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Parameterization1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote--allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(readdata(0,0));
	}
	
	public static String readdata(int row,int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		 String data = sht.getRow(row).getCell(coll).getStringCellValue();
		 
		 return data;
	}
}
//""