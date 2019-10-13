package SignupTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Generals.General;
import Generals.TakeScreenShots;
import HomePage.HomePage;
import SignupPage.SignupPage;

public class SignupTest {

	WebDriver driver;
	HomePage hp;
	SignupPage sp;
	General gen;
	TakeScreenShots ts;
	String Title = "Login - My Store"; // String is a Static variable & declare title

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Signup() throws Exception {
		
		hp = new HomePage(driver); // calling constructor of HomePage PageObject
		hp.clickSignin();
		
		gen= new General(driver);
		gen.getTitle(Title);
		
		sp= new SignupPage(driver);
		sp.SignUp();
		sp.Register();
		TakeScreenShots.takeScreenshot(driver, "Signup Fail");
	}

}
