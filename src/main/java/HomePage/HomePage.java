package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		
	WebDriver driver;
	By Signin= By.className("login");
	
	public HomePage(WebDriver driver) {  //Constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignin() {
		driver.findElement(Signin).click();
	}
}
