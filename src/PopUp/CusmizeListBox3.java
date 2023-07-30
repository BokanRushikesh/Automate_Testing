package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Configuration.ConfigurationPath;

public class CusmizeListBox3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",ConfigurationPath.WebDriverPath );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions (driver);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
//		act.moveToElement(day).click().build().perform();
		
		act.moveToElement(day).perform();
		
		act.click().perform();
		Thread.sleep(2000);
		for(int i=0;i<=30;i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		for(int i=0;i<=22;i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.click().perform();
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	    act.moveToElement(month).perform();
	    
	    act.click().perform();
	    Thread.sleep(2000);
	    
	    for(int a=0;a<=11;a++) {
	    	act.sendKeys(Keys.ARROW_UP).perform();
	    }
	    Thread.sleep(2000);
	    
	    for(int a=0;a<=8;a++) {
	    	act.sendKeys(Keys.ARROW_DOWN).perform();
	    }
	     act.click().perform();
	     
	   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	     
	     Select s = new Select(year);
	     
	     s.selectByVisibleText("1996");
	
	
	}
	
	
	
	
	
	

}
//    ""