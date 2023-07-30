package Scroll_Program;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class ScrollYoutube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-300)");
	}
}
//""