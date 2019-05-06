package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement ele = driver.findElement(By.id("keepLoggedInLabel"));
//		boolean a = ele.isDisplayed();
//          System.out.println(a);
		
		boolean a = ele.isSelected();
          System.out.println(a);
	}

}
