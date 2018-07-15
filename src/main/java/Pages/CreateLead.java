package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends WebDriverServiceImpl{

	public CreateLead() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement elecmpname;
	@FindBy(id="createLeadForm_firstName")
	WebElement elefn;
	@FindBy(id="createLeadForm_lastName")
	WebElement eleln;
	@FindBy(className="smallSubmit")
	WebElement elesb;
	public CreateLead TypecmpName(String cmpName) {
		type(elecmpname,cmpName);
		return this;
		
	}

	public CreateLead TypeFN(String fname) {
		type(elefn,fname );
		return this;
		
	} 	
	
	
	public CreateLead TypelN(String lname) {
		type(eleln,lname );
		return this;
		
	} 
	

	public ViewLead sb() {
		click(elesb);
		return new ViewLead();
		
	} 

	
}