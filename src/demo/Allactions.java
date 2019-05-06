package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Allactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement mousehover = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(mousehover).perform();
		Thread.sleep(3000);
		WebElement doubleclick = driver.findElement(By.xpath("//span[.='Create a List']"));
		a.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		WebElement rightclick = driver.findElement(By.linkText("Your Idea Lists"));
		a.contextClick(rightclick).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
