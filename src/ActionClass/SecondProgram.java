package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class SecondProgram {

	public static void main(String[] args) throws InterruptedException {
		
          System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		 WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 act.moveToElement(Day).perform();
		 
		 Thread.sleep(2000);
		 
		 act.click().perform();
		
		for(int i=1 ; i<=30;i++) {
			
			act.sendKeys(Keys.ARROW_UP).perform();
			
		}
		
		for(int i=1;i<=16;i++) {
			
//			Thread.sleep(2000);
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		
		   act.click().perform();
		
	}
}
