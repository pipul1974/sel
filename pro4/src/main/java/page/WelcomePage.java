package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Model.WelcomeModel;

public class WelcomePage extends WelcomeModel {
	public WelcomePage(WebDriver d) {
		super(d);
	}
public String getText(String userxpath) throws InterruptedException {
	String usertext;
	WebElement text=getUserText(userxpath);
	usertext=text.getText();
	return usertext;
	}


public void clickOn() throws InterruptedException {
	WebElement cli=clickPlus();
	Actions act = new Actions(driver);
	act.moveToElement(cli).click().perform();

}
public void createOn() throws InterruptedException {
	WebElement cr=createChannel();
	cr.click();
}

public boolean isChannelPresent(String channelName) throws InterruptedException {
	Thread.sleep(5000);
	boolean result=false;
	List<WebElement> all = getAllChannels();
	for(WebElement e: all) {
		String channel = e.getText();
		//System.out.println(channel);
		if(channel.contains(channelName))
		{
			result=true;
			break;
		}
	}
	
	return result;
}


public void ClickOnChannel(String channelName) throws InterruptedException {
	List<WebElement> all = getAllChannels();
	for(WebElement e: all) {
		String channel = e.getText();
		//System.out.println(channel);
		if(channel.contains(channelName))
		{
			e.click();
			break;
		}
	}
	
}
public  void clickOnRight(String channelName) throws InterruptedException {
	
WebElement po=rightClick(channelName);
Actions actions = new Actions(driver);
actions.moveToElement(po).contextClick().perform();

}
public void clickIt() throws InterruptedException {
	WebElement d=doClick();
	d.click();
	
}
public  void isMessagePresent(String message) throws InterruptedException {
	WebElement m=getWelcomeMessage();
	m.sendKeys(message);

}

public void clickArrow() throws InterruptedException {
	WebElement a=getArrowSign ();
	a.click();
	
}
public  void isPresentTime() throws InterruptedException {
	
WebElement ti=getTime();
Actions actions = new Actions(driver);
actions.moveToElement(ti).perform();

}
}