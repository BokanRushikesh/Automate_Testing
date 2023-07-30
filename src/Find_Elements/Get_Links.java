package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Get_Links {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Link = driver.findElements(By.xpath("//a"));
		
		System.out.println(Link.size());
		
	    for(int i=0;i<=Link.size()-1;i++) {
	    	
	    	System.out.println(Link.get(i).getText());
	    	
	    }
			driver.close();
	}
	
	}
//""