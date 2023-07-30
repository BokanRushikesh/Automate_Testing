package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class TestFaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']/following::select[3]")).sendKeys("1997");
		
		driver.findElement(By.xpath("//button[@name='websubmit']/preceding::input[7]")).sendKeys("123qwe");
		
		driver.findElement(By.xpath("//a[text()='Already have an account?']/preceding::input[11]")).sendKeys("bahubali");
		
		driver.findElement(By.xpath("(//input[@type='radio'])/preceding::select[3]")).sendKeys("24");
		
		driver.findElement(By.xpath("//input[@name='lastname']/following::select[2]")).sendKeys("Jun");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]/preceding::input[8]")).sendKeys("vikram");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']/following::input[6]")).click();
		
		driver.findElement(By.xpath("//select[@title='Year']/preceding::input[3]")).sendKeys("9990008889");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']/following::button[1]")).click();
		
		
	}
}
//""