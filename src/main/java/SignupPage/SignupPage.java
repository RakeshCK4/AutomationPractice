package SignupPage;

import java.sql.DriverPropertyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	WebDriver driver;
	By emailAddress = By.id("email_create");
	By submit = By.id("SubmitCreate");

	By gender = By.id("uniform-id_gender1");
	By cfname = By.id("customer_firstname");
	By clname = By.id("customer_lastname");
	By pswd = By.id("passwd");

	//to handle list element, click the main then traverse the path to the element
	By day = By.id("days");
	By day1= By.xpath("//select[@id='days']/option[9]");
	By month= By.id("days");
	By month1 = By.xpath("//select[@id='months']/option[9]");
	By year = By.id("years");
	By year1 = By.xpath("//select[@id='years']/option[9]");

	By fname = By.cssSelector("input#firstname");
	By lname = By.cssSelector("input#lastname");
	By comp = By.cssSelector("input#company");
	By address = By.cssSelector("input#address1");
	By city = By.cssSelector("input#city");
	By state1 = By.cssSelector("select#id_state");
	By state = By.xpath("//select[@id='id_state']/option[9]");
	By zip = By.cssSelector("input#postcode");
	By con = By.cssSelector("select#id_country");
	By con1 = By.xpath("//select[@id='id_country']/option[2]");
	By phone = By.cssSelector("input#phone_mobile");
	By add2 = By.cssSelector("input#alias");
	By regbtn = By.cssSelector("button#submitAccount");
	
	//zip code caution message
	By zcaut = By.xpath("//*[@class='alert alert-danger']");

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SignUp() {
		driver.findElement(emailAddress).sendKeys("rakeshck.test1@gmail.com");
		driver.findElement(submit).click();
	}

	public void Register() {
		driver.findElement(gender).click();
		driver.findElement(cfname).sendKeys("Rakesh");
		driver.findElement(clname).sendKeys("CK");
		driver.findElement(pswd).sendKeys("rake1994");
		/*
		 * driver.findElement(fname).sendKeys("Rakesh");
		 * driver.findElement(lname).sendKeys("CK");
		 */

		driver.findElement(day).click(); //click date fiel
		driver.findElement(day1).click(); //choose the date form list
		driver.findElement(month).click();
		driver.findElement(month1).click();
		driver.findElement(year).click();
		driver.findElement(year1).click();
		driver.findElement(comp).sendKeys("HP pvt.ltd");
		driver.findElement(address).sendKeys("39 main road JP nagara 7 phase");
		driver.findElement(city).sendKeys("Banglore");
		driver.findElement(state1).click(); // failing.....
		driver.findElement(state).click();
		driver.findElement(zip).sendKeys("508854");
		driver.findElement(con).click();
		driver.findElement(con1).click();
		driver.findElement(phone).sendKeys("9483925266");
		driver.findElement(add2).clear();
		driver.findElement(add2).sendKeys("40th main road JP nagara 7 phase");
		driver.findElement(regbtn).click();
		driver.findElement(zcaut).click();
	}
}
