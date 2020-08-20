package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBoxPageTest extends TestBase {
	@Test
	public void deleteBoxPageTest() throws InterruptedException {
	getSigningPage();
	String email="pipulhasan78@gmail.com";
	String password="kazirakhi78";

	signingpage.signin(email,password);

	getWelcomePage();
	String channelName = "booleanexpresion";
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


