package Test;

import org.testng.annotations.Test;

public class SkipPageTest extends TestBase {
	@Test
	public void skipPageTest() throws InterruptedException {
getSigningPage();
String email="pipulhasan78@gmail.com";
String password="kazirakhi78";

signingpage.signin(email,password);
  getWelcomePage();
  welcomepage.clickOn();
welcomepage.createOn();

getChannelPage();
String name="booeanexpresion";
channelpage.getChannel(name);
channelpage.clickOn();

getSkipPage();
skippage.clickSkipBox();
}

}
