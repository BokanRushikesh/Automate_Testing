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

import com.google.common.io.FileBackedOutputStream;

public class Paramererization3 {

	public static String readexcelsheet(int row ,int col) throws EncryptedDocumentException, IOException {

		FileInputStream File = new FileInputStream("C:\\Users\\USER\\Documents\\Parameterization\\Book1.xlsx");

		Sheet sht = WorkbookFactory.create(File).getSheet("sheet1");

		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;

		

	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		    System.out.println(readexcelsheet(0,0));
		    System.out.println(readexcelsheet(1,0));
//		    System.out.println(readexcelsheet(2,0));
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");

	Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(readexcelsheet(0,0));

	 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(readexcelsheet(1,0));
	
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(readexcelsheet(2,0));
	

	}

}
