package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Go']"));
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		a.dragAndDrop(source, target)
		Thread.sleep(3000);
		driver.close();

	}

}
