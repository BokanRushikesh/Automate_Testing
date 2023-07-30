package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class ChildBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
         ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		Thread.sleep(2000);
		
		Set<String> str = driver.getWindowHandles();
		System.out.println(str);
		
		
		Iterator<String> itr = str.iterator();
		
		while(itr.hasNext()) {
			String P = itr.next();
			System.out.println(P);
			
			 String C = itr.next();
			 System.out.println(C);
			 
			 driver.switchTo().window(C);
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			
			
		}
		
	}
	
}
