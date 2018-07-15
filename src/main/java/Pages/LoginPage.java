package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl{

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement eleusername;
	@FindBy(id="password")
	WebElement elepassword;
	@FindBy(className="decorativeSubmit")
	WebElement elelogin;
	public LoginPage TypeUserName(String uName) {
		type(eleusername,uName );
		return this;
		
	}

	public LoginPage TypePassword(String upwd) {
		type(elepassword,upwd );
		return this;
		
	} 	
	
	public HomePage clickLogin() {
		click(elelogin);
		return new HomePage();
		
	} 
	
}