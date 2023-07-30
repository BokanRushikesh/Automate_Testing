package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Get_Link_InputField {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		List<WebElement> input = driver.findElements(By.xpath("//input"));
		
		System.out.println(input.size());
	
	  for(int i=0;i<=input.size()-1;i++) {
		  
		  System.out.println(input.get(i).getText());
	  }
	    Thread.sleep(2000);
	
	   driver.close();
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
// ""