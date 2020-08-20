package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePageTest extends TestBase{
	@Test
	public void deleteChannelTest() throws InterruptedException {

	getWelcomePage();
	String channelName = "abc";
	welcomepage.ClickOnChannel(channelName);
	welcomepage.clickOnRight(channelName);
	welcomepage.clickIt();
	
	getDeletePage();
	deletepage.clickOnDelelte();
	
    getDeleteBoxPage();
    deleteboxpage.clickOnCheckBox();
    deleteboxpage.clickOnDeleteButton();

	
	//we will verify the new channel is added on welcome page under channel list.
	
	boolean actual =  welcomepage.isChannelPresent(channelName);
	
	Assert.assertFalse(actual);
	

}
}