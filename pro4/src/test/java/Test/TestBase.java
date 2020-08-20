package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import page.ChannelPage;
import page.DeleteBoxPage;
import page.DeletePage;
import page.SigningPage;
import page.SkipPage;
import page.WelcomePage;


public class TestBase {
	static WebDriver driver;
	static SigningPage signingpage;
	static WelcomePage welcomepage;
	static ChannelPage channelpage;
	static SkipPage skippage;
	
	
	
	static DeletePage deletepage;
	static DeleteBoxPage deleteboxpage;
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://family-co-group.slack.com");
		driver.manage().window().maximize();
}
	public SigningPage getSigningPage() {
		signingpage=new SigningPage(driver);
		return signingpage;
}
	public WelcomePage getWelcomePage() {
		welcomepage=new WelcomePage(driver);
		return welcomepage;
	}
	

	
	
	public ChannelPage getChannelPage() {
		channelpage=new ChannelPage(driver);
		return channelpage;
}
	public SkipPage getSkipPage() {
		skippage=new SkipPage(driver);
		return skippage;
	}
	public DeletePage getDeletePage() {
		deletepage=new DeletePage(driver);
		return deletepage;
	}
	public DeleteBoxPage getDeleteBoxPage() {
		deleteboxpage=new DeleteBoxPage(driver);
		return deleteboxpage;	
	}
	


}