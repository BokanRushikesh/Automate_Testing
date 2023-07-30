package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class HiddenFB {

	public static void main(String[] args) throws InterruptedException {
		
		
		
       System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Rushikeshbokan@123");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Rushikeshbokan@123");
        
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        
//        js.executeScript("document.getElementById('u_0_j_UV').value='Rushikesh';");
	}
	}

//"" ''