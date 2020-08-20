package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkipModel extends ModelBase {

	public SkipModel(WebDriver d) {
		super(d);
	}
	public WebElement getSkipBox() throws InterruptedException {
		Thread.sleep(4000);
		WebElement s=driver.findElement(By.xpath("//button[text()='Skip for now']"));
		return s;
}
}