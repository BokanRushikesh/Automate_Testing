package Practice2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class ChildBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		System.out.println(ids);
		
		Iterator<String> itr = ids.iterator();
		
		while(itr.hasNext()) {
			
			String parentframe = itr.next();
			
			System.out.println(parentframe);
			
			 String childframe = itr.next();
			 
			 System.out.println(childframe);
			 
			 
			 driver.switchTo().window(childframe);
			 
			 driver.manage().window().maximize();
			 
			 Thread.sleep(2000);
			 
			 driver.close();
			
		}
		
		
		
	}
	
	
}
//""