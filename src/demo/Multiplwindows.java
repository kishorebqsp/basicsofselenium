package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplwindows {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		int count = child.size();
		System.out.println(count);
		String tilt = driver.getTitle();
		System.out.println(tilt);
		for(String a:child)
		{
			driver.switchTo().window("amazon shopping");
		}
		for (String b : child) {
			driver.switchTo().window(b);
		}
		driver.get("https://www.amazon.com/");
	driver.switchTo().window(parent);
	driver.findElement(By.name("q")).sendKeys("jguyguyfguy")
		
		
	}

}
