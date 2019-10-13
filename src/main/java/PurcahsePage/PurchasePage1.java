package PurcahsePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage1 {

	WebDriver driver;
	
	By women = By.xpath("(//*[@class=\"sf-with-ul\"])[1]");
	By dress1 = By.xpath("//*[@class=\"ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line\"]");
	
	
	public PurchasePage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart(){
		driver.findElement(women).click();
		driver.findElement(dress1).click();
	}
}
