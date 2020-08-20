package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.DeleteModel;


public class DeletePage extends DeleteModel{
	public DeletePage(WebDriver d) {
		super(d);
		
	}
public void clickOnDelelte() throws InterruptedException {
	WebElement d=getDelete();
	d.click();
}

}
