package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import Configuration.ConfigurationPath;

public class ColourText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
        WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
        
         String backcolour = btn.getCssValue("background-color");
         
         System.out.println(backcolour);
         
       String Hexcolour = Color.fromString(backcolour).asHex();
       
       System.out.println(Hexcolour);
       
       if(Hexcolour.equals("#1877f2")) {
    	   
    	   System.out.println("verified");
       }
       
       else {
    	   
    	   System.out.println("not verified");
       }
	}
}
//""