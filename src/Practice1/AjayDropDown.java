package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Configuration.ConfigurationPath;

public class AjayDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		 WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select s = new Select(Day);
		 
		 s.selectByVisibleText("23");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 
		 Select S1 = new Select(month);
		 
		 S1.selectByVisibleText("Apr");
		 
		 WebElement year = driver.findElement(By.name("birthday_year"));
		 
		 Select S2 = new Select(year);
		 
		 S2.selectByVisibleText("1990");
		 
		    WebElement A = driver.findElement(By.name("birthday_year"));
		 
		      Select A1 = new Select(A);
		      
		       boolean Q = A1.isMultiple();
		      
		      System.out.println(Q);
		      
		      
		 
		 
		 
	}
	
	
}
//""