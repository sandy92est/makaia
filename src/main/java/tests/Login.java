package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
//import data.reader.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;


public class Login extends PreAndPost{
	@Test
	public void click1() {
		
		new LoginPage()
		.TypeUserName("DemoSalesManager").TypePassword("crmsfa").clickLogin().clickCRM().clickLeads().clickLeads1().TypecmpName("santo").TypeFN("som").TypelN("s").sb().verifyFname();
		
	}
		
	
}
		



