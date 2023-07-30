package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class AlertPopUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		
		String txt = driver.switchTo().alert().getText();
		
		          System.out.println(txt);
		
	           driver.switchTo().alert().accept();
		   
//		 Alert al = driver.switchTo().alert();
//		
//		     System.out.println(al.getText());
//		
//		         al.accept();
		
//		System.out.println(driver.getCurrentUrl());
		
		
	         String url = driver.getCurrentUrl();
	           
	           System.out.println(url);
	}
	
 }
//""