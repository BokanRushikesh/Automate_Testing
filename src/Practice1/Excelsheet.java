package Practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Excelsheet {

	public static String readdata(int row , int coll) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
		
	}
		
		
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			
			System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(readdata(4,0));
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(readdata(4,1));
			
			driver.findElement(By.xpath("//button[@name='login']")).click();
		}
	
	
	
	
	
}
//""