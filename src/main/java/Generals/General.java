package Generals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class General {
	
	WebDriver driver;
	
	public void getTitle(String actTitle) {
		
		String expTitle=driver.getTitle();
		
		if(actTitle.contains(expTitle))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
	}
	
	public General(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
