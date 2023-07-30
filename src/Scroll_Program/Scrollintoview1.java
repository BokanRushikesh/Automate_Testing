package Scroll_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrollintoview1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		
		driver.manage().window().maximize();
		
		 WebElement icon = driver.findElement(By.xpath("(//a[@class='sc-jqCOkK hzKGrM'])[2]"));
		 
		 Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true)", icon);
	}
}
//""