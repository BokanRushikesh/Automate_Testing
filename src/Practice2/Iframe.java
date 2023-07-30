package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
//		String  = name , String  = id , int = index 
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("Ajay");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123321");
		
		
	}
	
	
//	     //iframe[@id='singleframe']   "//input[@type= 'text']"      //a[text()='WebTable']  //input[@id='email']
	 
	
	

}
//""