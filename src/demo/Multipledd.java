package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("taj"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("cake");
		Thread.sleep(3000);
		boolean be = s.isMultiple();
		System.out.println(be);
		
		List<WebElement> options = s.getOptions();
		int c = options.size();
		System.out.println(c);
		
		ArrayList<String> a=new ArrayList<String>();
		
		if(s.isMultiple())
		{
			s.deselectByIndex(2);
			Thread.sleep(3000);
			s.deselectByValue("v");
			Thread.sleep(3000);
			s.deselectByVisibleText("cake");
		}
		
		for(WebElement b:options)
		{
			String text = b.getText();
			System.out.println(text);
			a.add(text);
		}
System.out.println("after sorting");
Collections.sort(a);

for(String ca:a)
{
	System.out.println(ca);
}
	
if(a.contains("vada"))
{
	System.out.println("option is present");
}
else
{
	System.out.println("option is not  present");
}
		
		driver.close();
	}

}
