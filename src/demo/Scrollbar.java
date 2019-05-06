package demo;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<5;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		}
		
		Thread.sleep(3000);
		
		for(int i=5;i>0;i--)
		{
			js.executeScript("window.scrollBy(0,-500)");
	}

	}

}
