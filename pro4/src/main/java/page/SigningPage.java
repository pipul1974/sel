package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.SigningModel;

public class SigningPage extends SigningModel {
public SigningPage(WebDriver d) {
	super(d);
}
public void signin(String email,String password) throws InterruptedException {
	WebElement e=getEmailBox();
	e.clear();
	e.sendKeys(email);
	
	WebElement p=getPasswordBox();
	p.clear();
	p.sendKeys(password);
	
	WebElement s=getSigninButton();
	s.click();
}
}
