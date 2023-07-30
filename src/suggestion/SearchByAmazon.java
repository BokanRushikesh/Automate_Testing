package suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class SearchByAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
		 List<WebElement> List = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		 
		 for(int i=0;i<=List.size()-1;i++) {
			 
			 String txt = List.get(i).getText();
			 
			 System.out.println(txt);
			 
		if(txt.equalsIgnoreCase("redmi note 11 pro +")) {
			
			List.get(i).click();
			
			break;
			
		}
		 }
	}
}
//""