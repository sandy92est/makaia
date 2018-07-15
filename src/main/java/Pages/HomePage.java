package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class HomePage extends WebDriverServiceImpl{

	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA")
	WebElement eleCRM;
	
	public MyHomePage clickCRM() {
		click(eleCRM);
		return new MyHomePage();
		
	} 
	
}


























