package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	
       driver.get("file:///C:/Users/USER/Documents/AnkitaPragati.html");	
       
       Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Rushikesh");
	
	driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Apparao");
	
	driver.findElement(By.xpath("/html/body/div[1]/input[3]")).sendKeys("Bokan");
	
	
	driver.findElement(By.xpath("/html/body/div[2]/input[1]")).click();
	
	driver.findElement(By.xpath("/html/body/div[4]/button[1]")).click();
	
	driver.findElement(By.xpath("/html/body/div[5]/a")).click();
	
	
	}
	
	

}
