package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class Facebook_Month {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		act.moveToElement(month).perform();
		
		act.click().perform();
		
		for(int i=0;i<=11;i++) {
			
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		for(int i=0;i<=8;i++) {
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.click().perform();
		
		
		
		driver.close();
	}
	
	
}
//""