package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	public WebDriver driver;
	@BeforeMethod
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://luxire.com/");
	}
	
	@Test
	public void loginluxury() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(By.id("search-input")).sendKeys("shirt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}

	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
