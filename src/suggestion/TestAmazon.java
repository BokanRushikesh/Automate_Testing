package suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class TestAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		
		Thread.sleep(3000);
		
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
		
		for(int i=0;i<=lst.size()-1;i++) 
		{
			 String element = lst.get(i).getText();
			 
			 System.out.println(element);
			 
			 if(element.equalsIgnoreCase("shoes for men sneakers")) 
			 {
				 lst.get(i).click();
				 
				 break;
			 }
		}
		
		
	}
}
//""