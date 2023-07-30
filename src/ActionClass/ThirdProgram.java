package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class ThirdProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 act.moveToElement(month).perform();
		 
		 Thread.sleep(2000);
		
		  act.click().perform();
		  
		  for(int i=1;i<=11;i++) {
			  
			  act.sendKeys(Keys.ARROW_UP).perform();
		  }
		
		  for(int i=1;i<=1;i++) {
			  
			  act.sendKeys(Keys.ARROW_DOWN).perform();
			  
		  }
		
		    act.click().perform();
		
		
		
	}
}
//""