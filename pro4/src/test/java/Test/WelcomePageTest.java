package Test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class WelcomePageTest extends TestBase {
	
	@Test
	public void welcomeTest() throws InterruptedException {
//	getSigningPage();
//	String email="pipulhasan78@gmail.com";
//	String password="kazirakhi78";
//	signingpage.signin(email, password);
	getWelcomePage();
	String userxpath="Familo Co";
	String actual="Familo Co";
	Assert.assertEquals(userxpath, actual);
	
	String message="My teacher teach me how i do project easily";
    welcomepage.isMessagePresent(message);	
	welcomepage.clickArrow();
	welcomepage.isPresentTime();
}
}	

