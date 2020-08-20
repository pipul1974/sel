package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteModel extends ModelBase {
public DeleteModel(WebDriver d) {
	super(d);
}
public WebElement getDelete() throws InterruptedException {
	Thread.sleep(2000);
	WebElement de =driver.findElement(By.xpath("//h3[text()='Delete this channel']"));
	return de;
}

}
