package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.name("B2")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		Thread.sleep(3000);
		System.out.println(text);
		//click on OK button'
		Thread.sleep(3000);
		a.accept();
		a.dismiss();
		Thread.sleep(3000);
		driver.close();

	}

}
