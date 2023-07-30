package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {

	public void M1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rushikesh");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bokan");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9096231202");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12344321");

		WebElement A = driver.findElement(By.xpath("//select[@id='day']"));

		Select sday = new Select(A);

		sday.selectByIndex(23);
		// select[@id='day']

		WebElement B = driver.findElement(By.xpath("//select[@id='month']"));

		Select smonth = new Select(B);

		smonth.selectByIndex(9);

		Thread.sleep(2000);
		// select[@id='month']

		WebElement C = driver.findElement(By.xpath("//select[@id='year']"));

		Select syear = new Select(C);

		syear.selectByIndex(1996);
		
		// select[@id='year']

	}

	public static void main(String[] args) throws InterruptedException {

		FaceBookSignUp Q = new FaceBookSignUp();

		Q.M1();

	}

}
