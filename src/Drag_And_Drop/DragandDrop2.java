package Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(3);
		   
		 WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		 
		 WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(img1, dest).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		 
		 act.dragAndDrop(img4, dest).perform();
		 
		
		 
		
	}
}
//""