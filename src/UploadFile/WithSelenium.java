package UploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class WithSelenium {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/rio/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='btn line-btn'])[2]")).click();
		
//		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\USER\\Desktop\\Notes\\Automation\\JavaPractice");
		
		WebElement str = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // its a interface
		
		js.executeScript("arguments[0].click();", str);
		
		
		Robot rb = new Robot();
		
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\USER\\Desktop\\Notes\\Automation\\JavaPractice");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
//		rb.keyPress(KeyEvent.VK_CONTROL); // use to press ctrl button
//		
//		rb.keyPress(KeyEvent.VK_V);  //  use to press V button
//		
//		rb.keyRelease(KeyEvent.VK_CONTROL); // use to release ctrl button
//		
//		rb.keyRelease(KeyEvent.VK_V); // use to release V button
//		
//		rb.keyPress(KeyEvent.VK_ENTER); // use to press Enter button
//		
//		rb.keyRelease(KeyEvent.VK_ENTER); // use to release Enter button
//		
		
	}
}
//""