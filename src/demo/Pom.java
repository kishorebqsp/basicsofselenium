package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(id="username")
	private WebElement usernametextbox;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void zxy(String user)
	{
		usernametextbox.sendKeys(user);
	}

}
