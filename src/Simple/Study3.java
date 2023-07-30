package Simple;

import java.awt.geom.Point2D;

import org.apache.xmlgraphics.image.loader.ImageException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study3 {
	public static void main(String[] args) throws ImageException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize window
		
		driver.get("https://www.cricbuzz.com/"); // Crickbuzz App
		
		Dimension d = new Dimension (400, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p);
		
		
		
		driver.quit();
		
		
	}

}
