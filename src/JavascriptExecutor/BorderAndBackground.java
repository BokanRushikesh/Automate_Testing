package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class BorderAndBackground {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		
        driver.manage().window().maximize();
        
        WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("arguments[0].setAttribute('style','border:3px solid red;background:green')", btn);
	}
}
//"" ''