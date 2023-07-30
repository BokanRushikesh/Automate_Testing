package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class ChidBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
        ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	
	    Set<String> ids = driver.getWindowHandles();
	    
        System.out.println(ids);
	    

	   	Iterator<String> itr = ids.iterator();
		
		while(itr.hasNext()) {
			String Parentwin = itr.next();
			System.out.println(Parentwin);
			String Childwin = itr.next();
			System.out.println(Childwin);
			
			driver.switchTo().window(Childwin);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.switchTo().window(Parentwin);
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		}
		
}
	
	
}
