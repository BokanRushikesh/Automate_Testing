package Simple;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study10 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	Dimension d = new Dimension(500,500);
	driver.manage().window().setSize(d);
	
	Point p = new Point (200,200);
	driver.manage().window().setPosition(p);
	
	String S  = driver.getTitle(); // use to print current page title
	System.out.println(S);
	
	String A = driver.getCurrentUrl(); // use to print current page url (Link)
	System.out.println(A);
	
	driver.navigate().forward();
	
	driver.get("https://majhinaukri.in/current-recruitment/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	driver.close();
	}

}
