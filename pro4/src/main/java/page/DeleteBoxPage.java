package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.DeleteBoxModel;

public class DeleteBoxPage extends DeleteBoxModel{
public DeleteBoxPage(WebDriver d) {
	super(d);
}
public void clickOnCheckBox() throws InterruptedException {
	Thread.sleep(4000);
	WebElement b=getDeleteCheckBox();
	b.click();
}


public void clickOnDeleteButton() throws InterruptedException {
	Thread.sleep(3000);
	WebElement b = getDeleteButton();
	b.click();
}
}
