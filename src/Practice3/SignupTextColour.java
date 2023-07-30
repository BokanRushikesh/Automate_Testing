package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import Configuration.ConfigurationPath;

public class SignupTextColour {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		 WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		 
		  String backcolour = btn.getCssValue("background-color");
		  
		  System.out.println(backcolour);
		  
		   String hexa = Color.fromString(backcolour).asHex();
		   
		   System.out.println(hexa);
		   
		   if(hexa.equals("#00a400")) {
			   
			   System.out.println("verified");
		   }
		   
		   else {
			   
			   System.out.println("not verified");
		   }
	}
}
//""