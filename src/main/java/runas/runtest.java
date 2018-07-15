package runas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions (features="src/main/java/feature/login.feature",glue="steps",monochrome=true, tags= "@smoke")
@RunWith(Cucumber.class)
public class runtest {
	

}
