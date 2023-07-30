package Practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class AjayWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		String A = driver.getTitle();
		
		System.out.println(A);
		
		String J = driver.getCurrentUrl();
		
		System.out.println(J);
		
		Thread.sleep(2000);
		
	    Dimension d = new Dimension(200,500);
		
		driver.manage().window().setSize(d);
		
		System.out.println(d);
		
		Thread.sleep(2000);
		
		Point p = new Point(400,300);
		driver.manage().window().setPosition(p);
	
		
		Point Q = new Point(400,300);  //  get position in console
		driver.manage().window().getPosition();
		System.out.println(Q);
		
		
	}
	
	
}
//""