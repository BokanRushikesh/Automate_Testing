package suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class SearchOnGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("oneplus 9R");
		
		Thread.sleep(5000);
		
//		ul is a parent locator in input field
		
//		li is child locator in input field 
		
		  List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		    for(int i=0;i<=list.size()-1;i++) {
		    	
		    	 String txt = list.get(i).getText();
		    	 
		    	 System.out.println(txt);
		    	 
		  if(txt.equalsIgnoreCase("oneplus 9r back cover")) {
			  
			  
			  list.get(i).click();
			  
			  break;
		  }
		    	
		    }
		
	}
	
	
	
	
	
	
	
	
}
//""