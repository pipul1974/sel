package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChannelModel extends ModelBase {

	public ChannelModel(WebDriver d) {
		super(d);
	}
	public WebElement getNameChannel() throws InterruptedException{
		Thread.sleep(4000);//input[@name='channel-name']
		WebElement ch=driver.findElement(By.xpath("//input[@name='channel-name']"));
		return ch;
	}
	
	public WebElement clickOncreate() throws InterruptedException {
		Thread.sleep(4000);
		WebElement cr=driver.findElement(By.xpath("//div[@class='c-sk-modal_footer_actions']"));
		return cr;
}
}