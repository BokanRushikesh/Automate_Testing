package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown6 {
	
	public void M1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		WebElement DayA = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select SDay = new Select (DayA);
		
		SDay.selectByVisibleText("24");
		
		Thread.sleep(2000);
		
		WebElement MonthA = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select Smonth = new Select (MonthA);
		
		Smonth.selectByVisibleText("Oct");
		
		Thread.sleep(2000);
		
		WebElement yearA = driver.findElement(By.xpath("//select[@id='year']"));
	
	    Select Syear = new Select( yearA);
	    
	    Syear.selectByVisibleText("1998");
	    
	    
}
     public static void main(String[] args) throws InterruptedException {
		
	
    	 DropDown6 D = new DropDown6();
    	 
    	 D.M1();
     
     
     }
}
