package BalajiProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void m1(WebDriver driver) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		 String str = d.toString().replace(":", "_");
		 
		File dest = new File("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\"+str+"image.jpg");
		
		FileHandler.copy(source, dest);
	}
}
//""