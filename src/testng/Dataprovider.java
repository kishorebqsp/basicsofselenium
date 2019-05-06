package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	public WebDriver driver;
	@DataProvider(name="abc")
	
	public Object[][] credentials()
	{
		return new Object[][] {{"admin","manager"},{"landtinfotech","1224345"}};
	}
	
	@Test(dataProvider="abc")
	public void login(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.close();
		
	}

	
	}


