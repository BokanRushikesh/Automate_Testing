package WebElementMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot9 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		ScreenShot9.M1(driver);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rushikesh");
		ScreenShot9.M1(driver);
		driver.close();

		

	}

	public static void M1(WebDriver driver) throws IOException, InterruptedException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();

		String str = d.toString().replace(":", "_");

		File Destination = new File("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\" + str + "image.jpg");

		FileHandler.copy(source, Destination);
		
		

	}
}
