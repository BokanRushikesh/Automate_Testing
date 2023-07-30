package Practice2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class ChildBrowser {

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
		        	  
		        	  String parentwindow = itr.next();
		        	  
		        	  System.out.println(parentwindow);
		        	  
		        	   String childwindow = itr.next();
		        	   
		        	   System.out.println(childwindow);
		        	   
		        	   
		        	   driver.switchTo().window(childwindow);
		        	   
		        	   driver.manage().window().maximize();
		        	   
		        	   Thread.sleep(2000);
		        	   
		        	   driver.manage().window().minimize();
		        	   
		        	   Thread.sleep(2000);
		        	   
		        	   driver.manage().window().maximize();
		          }
	}
}
//""