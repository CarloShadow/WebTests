package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Core.DriverFactory.getDriver;

public class LoginPage {
	
	public
	WebElement inputUserName = getDriver().findElement(By.id("user-name"));
	
	public
	WebElement inputPassword = getDriver().findElement(By.id("password"));
	
	public
	WebElement loginPassword = getDriver().findElement(By.id("login-button"));
}
