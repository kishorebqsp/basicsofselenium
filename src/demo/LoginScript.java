package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the valid URL
		driver.get("https://www.amazon.com/");
		
		//max the browser
		driver.manage().window().maximize();
		
		//click on signin button
		driver.findElement(By.id("nav-link-account")).click();
		
		//enter the valid username
		driver.findElement(By.id("ap_email")).sendKeys("8898822760");
		
		//applying implicity wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		
		//enter the valid password
		WebDriverWait w=new WebDriverWait(driver,5);
//		WebElement ele = driver.findElement(By.id("ap_password"));
//		w.until(ExpectedConditions.visibilityOf(ele));
//		ele.sendKeys("8898822760");
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
//				(id("ap_password")).sendKeys("dfghedfty"));
w.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")))
.sendKeys("gfgdfghfdggy");
			
		
		//click on sigin button
		WebElement ele = driver.findElement(By.id("signInSubmit"));
		w.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//url of the application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//verfication
		if(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"))

		{
			System.out.println("home page is displayed");
		}
		else
		{
			System.out.println("home page is not displayed");
		}
	

	//close the browser
	driver.close();
}

}