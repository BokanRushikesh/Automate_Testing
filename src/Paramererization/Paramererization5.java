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

public class Paramererization5 {
	
	public static String ReadExcelSheet(int row,int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\USER\\Documents\\Parameterization\\Book1.xlsx");
		
		Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data ;
		
		
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.out.println(ReadExcelSheet(0,0));
		System.out.println(ReadExcelSheet(1,0));
		System.out.println(ReadExcelSheet(2,0));
		System.out.println(ReadExcelSheet(3,0));
		System.out.println(ReadExcelSheet(4,0));
		System.out.println(ReadExcelSheet(5,0));
		System.out.println(ReadExcelSheet(6,0));
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://www.facebook.com/signup");
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(ReadExcelSheet(0,0));
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ReadExcelSheet(1,0));
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ReadExcelSheet(2,0));
	
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(ReadExcelSheet(3,0));
	
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys(ReadExcelSheet(4,0));
	
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys(ReadExcelSheet(5,0));
	
	driver.findElement(By.xpath("//select[@id='year']")).sendKeys(ReadExcelSheet(6,0));
	
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	
	}
	
	
	
	
	
	
	
	
	
}
