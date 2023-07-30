package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class AjayWebElements {

	
    public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		
		driver.manage().window().maximize();
		
	
	   WebElement A = driver.findElement(By.xpath("//button[@id='email-otp-btn']"));
		
                  boolean J = A.isDisplayed();
                  
               System.out.println(" Display  - "+ J);   
                  
               
               WebElement B = driver.findElement(By.xpath("//button[@id='email-otp-btn']"));
       		
               boolean R = B.isEnabled();
               
            System.out.println(" Enable  - "+R);   
               

            WebElement C = driver.findElement(By.xpath("//label[@for='cb-privacy']"));
       		
            boolean V = C.isSelected();
            
            System.out.println(" Select  - "+V);   
            
            
            
          

}               
}
//""