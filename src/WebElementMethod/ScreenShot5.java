package WebElementMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot5 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/reg/");
	
	Thread.sleep(2000);
	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Date d = new Date ();
	
	String str = d.toString().replace(":", "_");
	
	File destination = new File ("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\"+str+"image.jpg");
	
	FileHandler.copy(Source, destination);
	}


}
