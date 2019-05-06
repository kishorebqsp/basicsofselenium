package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
}

@Parameters({"browser"})
@Test
public void testA(String browser)
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("tyrftyftyfytg7u");
	driver.findElement(By.name("pwd")).sendKeys("fbhgfuhgfhy");
}

@AfterMethod
public void closeapp()
{
	driver.close();
}
	
}
