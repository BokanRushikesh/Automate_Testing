package WebElementMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {
	
    public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com/reg/");
    
    Thread.sleep(2000);
    
   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   
   File destination  = new File ("C:\\Users\\USER\\Documents\\Selenium ScreenShot.image.jpg");
    
    FileHandler.copy(source, destination);
    
    
    
    }	


}
