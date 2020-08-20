package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import draw.ExelReader;


public class ChannelPageTest extends TestBase {
@Test(dataProvider="cr")
	public void addChannelTest(String name) throws InterruptedException {
//	getSigningPage();
//	String email="pipulhasan78@gmail.com";
//	String password="kazirakhi78";
//    signingpage.signin(email,password);
	
    getWelcomePage();
	welcomepage.clickOn();  //click on plus
	welcomepage.createOn();  //menu create channel

	getChannelPage();
	//String name="overloading";
	channelpage.getChannel("abc"); 
	channelpage.clickOn();
	
	getSkipPage();
	skippage.clickSkipBox();

	
	//we will verify the new channel is added on welcome page under channel list.
	
	boolean actual =  welcomepage.isChannelPresent(name);
	
	Assert.assertTrue(actual);
	}
@DataProvider(name="cr")
public Object[][] datafeeder() throws IOException{
Object[][] t;
String file="data/slack.xlsx";
String sheetname="Sheet4";
t = ExelReader.excelTo2DArray(file, sheetname);


return t;


}
}