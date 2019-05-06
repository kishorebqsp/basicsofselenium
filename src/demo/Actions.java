package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[6]"));
		org.openqa.selenium.interactions.Actions a=new org.openqa.selenium.interactions.Actions(driver);
		a.moveToElement(ele).perform();
	}

}
