package BalajiProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import Configuration.ConfigurationPath;

public class practice {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select s = new Select(day);
		 
		 s.selectByVisibleText("20");
		 
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		  Select s1 = new Select(month);
		  
		  s1.selectByVisibleText("Apr");
		  
		   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		   
		   Select s2 = new Select(year);
		   
		   s2.selectByVisibleText("2010");
		   
		    boolean status = s2.isMultiple();
		    
		    System.out.println(status);
		    
		    s1.getFirstSelectedOption();
		    
	}
}
//""