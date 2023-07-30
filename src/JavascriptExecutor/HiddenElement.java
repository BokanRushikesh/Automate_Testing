package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class HiddenElement {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://courses.letskodeit.com/practice");
		
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("document.getElementById('displayed-text').value='Rushikesh';");
	}
}
//"" ''