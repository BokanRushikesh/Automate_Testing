package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Get_Links_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Dropdown = driver.findElements(By.xpath("//select"));
		
		System.out.println(Dropdown.size());
		
		for(int i=0 ; i<=Dropdown.size()-1;i++) {
			
			System.out.println(Dropdown.get(i).getText());
		}
		
		 Thread.sleep(2000);
		 
		 driver.close();
	}
}
//""