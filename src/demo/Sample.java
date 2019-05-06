package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Pom p=new Pom(driver);
		//WebElement ele = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		//ele.sendKeys("jhguyedguygdefdtyrfwetfgdf");
		p.zxy("hegfdtyebdf");

	}

}
