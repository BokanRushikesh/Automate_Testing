package TestING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Sample8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		String str = driver.getTitle();
		
		System.out.println(str);
	
		if(str.equals("Facebook – log in or sign up")) {
			
			System.out.println("Test case passed");
	}
		else {
			System.out.println("Test case failed");	
		}
	}
}
//""