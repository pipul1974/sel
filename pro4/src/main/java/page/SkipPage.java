package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Model.SkipModel;


public class SkipPage extends SkipModel {
 public SkipPage(WebDriver d) {
	 super(d);
	 
 }
 public void clickSkipBox() throws InterruptedException {
		WebElement cli= getSkipBox();
		cli.click();
}
}