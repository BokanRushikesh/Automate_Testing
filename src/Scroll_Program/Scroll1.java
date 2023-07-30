package Scroll_Program;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Scroll1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		
		Thread.sleep(2000);
		
//		((JavascriptExecutor)driver).executeScript("scroll(0,0)");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-2000)");
		
		
		
		
	}
}
//""