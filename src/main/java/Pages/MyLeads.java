package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class MyLeads extends WebDriverServiceImpl{

	public MyLeads () {

		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Create Lead")
	WebElement eleCLeads;
	
	public CreateLead clickLeads1() {
		click(eleCLeads);
		return new CreateLead();
	} 
	
}


























