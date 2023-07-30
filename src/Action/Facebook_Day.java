package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Configuration.ConfigurationPath;

public class Facebook_Day {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		act.moveToElement(day).perform();
		
		act.click().perform();
		
		for(int i=0;i<=30;i++) {
			
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		for(int i=0;i<=13;i++) {
			
			act.sendKeys(Keys.ARROW_DOWN).perform(); // select value update by 2
		}
		
		act.click().perform();
	}
	

}
// ""