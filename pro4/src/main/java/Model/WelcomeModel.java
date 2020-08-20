package Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomeModel extends ModelBase {
public WelcomeModel(WebDriver d) {
	super(d);
}

public WebElement rightClick(String channelName) throws InterruptedException {
	Thread.sleep(2000);
	channelName="//span[text()='"     +channelName+  "']";	
	WebElement ch=driver.findElement(By.xpath(channelName));
	return ch;
	
}
public WebElement doClick() throws InterruptedException {
	Thread.sleep(2000);
	WebElement d =driver.findElement(By.xpath("(//div[@class='c-menu_item__label'])[4]"));
	return d;	

}
public WebElement getUserText(String userxpath) throws InterruptedException {
	Thread.sleep(2000);
userxpath="//span[text()='"     +userxpath+  "']";	
WebElement user=driver.findElement(By.xpath(userxpath));
return user;
}
public WebElement clickPlus() throws InterruptedException {
	Thread.sleep(5000);
	//WebElement cp=driver.findElement(By.xpath("(//*[@type='button'])[13]"));
	WebElement cp = driver.findElement(By.xpath("//button[contains(@class, 'heading_plus')]"));
    return cp;
}
public WebElement createChannel() throws InterruptedException {
	Thread.sleep(5000);
	WebElement ch=driver.findElement(By.xpath("//div[text()='Create a channel']"));
    return ch;
}


public List<WebElement> getAllChannels() throws InterruptedException{
	Thread.sleep(5000);
	List<WebElement> channels = driver.findElements(By.xpath("//i[@type='channel-pane-hash']/following-sibling::span"));
	
	return channels;
}
public WebElement getWelcomeMessage () throws InterruptedException{
	Thread.sleep(5000);
	WebElement mess  = driver.findElement(By.xpath("//div[@aria-label='Message #welcome']"));
	
	return mess ;
}
public WebElement getArrowSign () throws InterruptedException{
	Thread.sleep(5000);
	WebElement arr  = driver.findElement(By.xpath("//i[@type='paperplane-filled']"));
	
	return arr ;

		

}
public WebElement getTime () throws InterruptedException{
	Thread.sleep(5000);
	WebElement t  = driver.findElement(By.xpath("(//span[@class='c-timestamp__label'])[12]"));
	
	return t ;
}
}