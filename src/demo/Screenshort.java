package demo;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// typecasting
		TakesScreenshot t = (TakesScreenshot) driver;
		// access the method present in takessceenshort interface
		File src = t.getScreenshotAs(OutputType.FILE);
		// required location address
		File dest = new File("./photo/amazonloginpage.png");
		// copy from src to dest
		FileUtils.copyFile(src, dest);

	}

}
