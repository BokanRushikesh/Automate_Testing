package suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt =  new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
//		driver.findElement(By.xpath("//label[@class='_1fqY3P']")).sendKeys("abc");
		
		
		
		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		
		Thread.sleep(10000);
		
		List<WebElement> List = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		
		
		
		for(int i=0;i<=List.size()-1;i++) {
			
		 String txt = List.get(i).getText();
		 
		 System.out.println(txt);
		 
		 if(txt.equalsIgnoreCase("laptop table")) {
			 
			 List.get(i).click();
			 
			 break;
		 }
	}
		
		
		
		
		
		
	}
}
//""