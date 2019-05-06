package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement ele = driver.findElement(By.name("country"));
		Select s=new Select(ele);
		s.selectByIndex(12);
		Thread.sleep(3000);
		s.selectByValue("BELGIUM");
		Thread.sleep(3000);
		s.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		boolean b = s.isMultiple();
		System.out.println(b);
		driver.close();
		

	}

}
