package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[.='Log In/Sign Up'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@user-actions='login_clicked']")).click();
		driver.findElement(By.id("input_0")).sendKeys("fggfuytfyghdfty67");
	}
				
	
	}


