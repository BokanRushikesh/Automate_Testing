package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
//	driver.navigate().back();
	
//	driver.navigate().forward();
	
	driver.get("https://www.youtube.com/");
	
	//driver.manage().window().minimize();
	
	 String A = driver.getTitle();
	 System.out.println(A);
	
	String B = driver.getCurrentUrl();
	
	System.out.println(B);
	
	Dimension D = new Dimension (400,400);
	
	driver.manage().window().setSize(D);
	
	Point P = new Point (200,200);
	
	driver.manage().window().setPosition(P);
	
//	driver.close();
	
//	driver.quit();
	
	
	
	
	}
	
}
	
	
	
	
	
	
	
//	""