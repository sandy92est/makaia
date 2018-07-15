package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createLeadcucum {
	
	ChromeDriver driver;
	@Given ("open the browser")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
}
	@And("Launch the url")
	public void launchUrl(){
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	}
	@And ("set the timeouts")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@And("maximize the browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		
	}
	@And("enter the user name as (.*)")
	public void userName (String value) {
		driver.findElementById("username").sendKeys(value);;
	}
	@And("enter the password as (.*)")
	public void passWord(String value1) {
		driver.findElementById("password").sendKeys(value1);
		
	}
	@When("click on the login button")
	public void Login() {
		driver.findElementByClassName("decorativeSubmit").click();
		
	}	
	
	@Then("login should be success")
	public void Success() {
		System.out.println("login success");
	}
	@But("login should be failure")
	public void failure() {
		System.out.println("login failure");
	}
	
	
	
	
}
