package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl{

	public MyHomePage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Leads")
	WebElement eleLeads;
	
	public MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads();
	} 
	
}


























