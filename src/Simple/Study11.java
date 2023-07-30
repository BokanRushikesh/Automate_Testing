package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study11 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
	     WebDriver Rushi = new ChromeDriver();
	     
	     Rushi.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	     Rushi.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rushikesh");
	
	     Rushi.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bokan");
	
	     Rushi.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9098780909");
	
	     Rushi.findElement(By.xpath("//input[@data-type ='password' ]")).sendKeys("asdfg");
	   
	     Rushi.findElement(By.xpath("  //select[@id='day' ]")).sendKeys("10");
	
	     Rushi.findElement(By.xpath(" //select[@title='Month' ] ")).sendKeys("Apr");
	     
	     Rushi.findElement(By.xpath(" //select[@title='Year' ] ")).sendKeys("1990");
	
	     Rushi.findElement(By.xpath(" (//input[@type='radio'])[2] ")).click();
	
	     Rushi.findElement(By.xpath(" (//button[@type='submit']) ")).click();
	
	
	
	
	}

}
