package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Child2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		

		 
		 for(String winid:ids) 
		 {
			 String title = driver.switchTo().window(winid).getTitle();
			 
			 System.out.println(title);
			 
		 if(title.equals("OrangeHRM (@orangehrm) / Twitter")) {
//				 driver.manage().window().minimize();
			 
			 driver.close();
			 }
		 }
		 
		    
	}
}
//""