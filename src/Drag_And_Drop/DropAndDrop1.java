package Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class DropAndDrop1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(3);
		
		
		WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		
	    Actions act = new Actions(driver);
	    
	    act.dragAndDrop(source, dest).perform();
	    
	    Thread.sleep(2000);
	
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(3);
	    
        WebElement source1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		
		WebElement dest1 = driver.findElement(By.xpath("//div[@id='trash']"));
		   
	    act.dragAndDrop(source1, dest1).perform();
	
	    Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();
	
         driver.switchTo().frame(3);
	    
        WebElement source2 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		
		WebElement dest2 = driver.findElement(By.xpath("//div[@id='trash']"));
		   
	    act.dragAndDrop(source2, dest2).perform();
	
	    Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();
	
	
          driver.switchTo().frame(3);
	    
        WebElement source3 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		WebElement dest3 = driver.findElement(By.xpath("//div[@id='trash']"));
		   
	    act.dragAndDrop(source3, dest3).perform();
	
	    Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();
	
	}
	
}
// ""