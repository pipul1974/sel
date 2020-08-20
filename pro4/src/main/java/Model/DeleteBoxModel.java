package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteBoxModel extends ModelBase {
public DeleteBoxModel(WebDriver d) {
	super(d);
}
public WebElement getDeleteButton() throws InterruptedException {
	Thread.sleep(2000);
	WebElement db =driver.findElement(By.xpath("//button[text()='Delete Channel']"));
	return db;
}




public WebElement getDeleteCheckBox() throws InterruptedException {
	Thread.sleep(2000);
	WebElement db =driver.findElement(By.xpath("//input[@id='delete_channel_cb']"));
	return db;
}


}