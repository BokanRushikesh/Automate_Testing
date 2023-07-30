package Paramererization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paramererization2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\USER\\Documents\\Parameterization\\Book1.xlsx");
		
		 Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		String data = sht.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
        String data1 = sht.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data1);
		
         String data2 = sht.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data2);

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data);
		
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data2);
		
		
	}
	
	
	
	
	
	
	

}
