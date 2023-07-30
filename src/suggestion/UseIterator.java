package suggestion;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class UseIterator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme");
		
		Thread.sleep(2000);
		
		List<WebElement> List = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		
		              Iterator<WebElement> txt = List.iterator();
		              
		              while(txt.hasNext()) {
		            	  
		            	   String option = txt.next().getText();
		            	  
		            	  if(option.equalsIgnoreCase("realme 10 pro plus")) {
		            		  
		            		  List.get(9).click();
		            	  }
		          }
		              
		              
		            	  
		            	  
		              
	}
}
//""