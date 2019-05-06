package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("bdghgfu");
		driver.findElement(By.name("pwd")).sendKeys("bhjfguguyfguy");
		String title = driver.getTitle();
	//Assert.assertEquals(title,"actiTIME - Login12345");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"guytfyd67t6");
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	

}
