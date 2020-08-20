package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigningModel extends ModelBase {
public SigningModel(WebDriver d) {
	super(d);
}
public WebElement getEmailBox() throws InterruptedException {
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	return email;
}
public WebElement getPasswordBox() throws InterruptedException {
	Thread.sleep(2000);
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	return password;
	
}

public WebElement getSigninButton() throws InterruptedException {
	Thread.sleep(2000);
	WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	return signin;
}
}
