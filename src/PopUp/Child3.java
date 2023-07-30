package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Child3 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		 Set<String> ids = driver.getWindowHandles();
		 
		 System.out.println(ids);
		 
		 for(String winid:ids) 
		 {
			 String title = driver.switchTo().window(winid).getTitle();
			 
			 System.out.println(title);
			 
			 
		 }
	}
}
//""