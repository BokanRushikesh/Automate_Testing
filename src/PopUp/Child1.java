package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Child1 {

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
		
		Iterator<String> itr = ids.iterator();
		
		while(itr.hasNext()) {
			
			String Parent = itr.next();
			
			String child = itr.next();
			
			System.out.println(Parent);
			System.out.println(child);
			
			driver.switchTo().window(child);
			
			driver.manage().window().maximize();
		}
	}
}
//""