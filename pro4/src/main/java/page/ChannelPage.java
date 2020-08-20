package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Model.ChannelModel;

public class ChannelPage extends ChannelModel {

	public ChannelPage(WebDriver d) {
		super(d);
	}

	public void getChannel(String name) throws InterruptedException {
		WebElement n = getNameChannel();
		n.sendKeys(name);
//		Actions act = new Actions(driver);
//		act.moveToElement(n);
//		act.click();
//		act.sendKeys(name);
//		act.perform();

	}

	public void clickOn() throws InterruptedException {
		WebElement cli = clickOncreate();
		cli.click();

	}
}
