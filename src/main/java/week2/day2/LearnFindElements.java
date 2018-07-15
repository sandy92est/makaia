package week2.day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnFindElements {
	
	public static void main(String[] args) throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://localhost:4444/wd/hub"), dc);
		
		
		
	/*	
		
		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SXT",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		WebElement trainTable = 
				driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> tableRows = trainTable.findElements(By.tagName("tr"));
		System.out.println(tableRows.size());
		int size = driver.
				findElementsByXPath("//table[@class='DataTable TrainList']//tr[1]/td").size();
		System.out.println(size);
		List<WebElement> allCol = driver.
				findElementsByXPath("//table[@class='DataTable TrainList']//tr[1]/td");
		allCol.get(0).click();*/
		
	}

}














