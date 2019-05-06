package demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> child = driver.getWindowHandles();
        System.out.println(child);
        Thread.sleep(3000);
        driver.quit();
	}

}
