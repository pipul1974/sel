package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import draw.ExelReader;

public class SigningPageTest extends TestBase {
	@Test(dataProvider="login")
	public void signingTest(String email,String password) throws InterruptedException {
		getSigningPage();
		signingpage.signin(email, password);
		
}
	@DataProvider(name="login")
public Object[][] datafeeder() throws IOException{
	Object[][] t;
	String file="data/slack.xlsx";
	String sheetname="Sheet3";
	t = ExelReader.excelTo2DArray(file, sheetname);
	
	
	return t;
	
	
}
	
}