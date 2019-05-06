package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(2000);
		List<WebElement> e = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = e.size();
		Thread.sleep(2000);
		System.out.println(count);
		for(WebElement b:e)
		{
			String t = b.getText();
			System.out.println(t);
		}
	}

}
