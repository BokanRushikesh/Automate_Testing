package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class CusmizelistBox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
//	to perform action on custmize list box we have to create Action class Object
		
	    Actions act = new Actions(driver);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		act.moveToElement(day).perform();  // move cursor from main page to day window
		
		act.click().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		
		
	}
	
	

}
