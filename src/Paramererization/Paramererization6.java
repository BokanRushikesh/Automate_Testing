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

public class Paramererization6 {
	public static String ExcelSheet(int row,int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		 Sheet sht = WorkbookFactory.create(File).getSheet("sheet1");
		 
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	System.out.println(ExcelSheet(0,0));
	System.out.println(ExcelSheet(1,0));
	System.out.println(ExcelSheet(2,0));
	System.out.println(ExcelSheet(3,0));
	System.out.println(ExcelSheet(4,0));
	System.out.println(ExcelSheet(5,0));
	System.out.println(ExcelSheet(6,0));
	
	
System.setProperty("webdriver.chrome.driver",ConfigurationPath. WebDriverPath);

WebDriver driver = new ChromeDriver ();

driver.get("https://www.facebook.com/signup");

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(ExcelSheet(0,0));

driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ExcelSheet(1,0));

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ExcelSheet(2,0));

driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(ExcelSheet(3,0));

driver.findElement(By.xpath("//select[@id='day']")).sendKeys(ExcelSheet(4,0));

driver.findElement(By.xpath("//select[@id='month']")).sendKeys(ExcelSheet(5,0));

driver.findElement(By.xpath("//select[@id='year']")).sendKeys(ExcelSheet(6,0));

driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

}

}
