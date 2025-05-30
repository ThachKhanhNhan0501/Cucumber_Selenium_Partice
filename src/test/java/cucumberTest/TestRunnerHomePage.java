package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "/Auto/cucumberPratice2023/PracticeAutoTest2023/src/test/resources/feature",
		//glue = "/Auto/cucumberPratice2023/PracticeAutoTest2023/src/test/java/stepDefinition",
		glue = "stepDefinition",
		plugin = {
		"html:target/cucumber-reports/TestRunnerHomePage.html",
		"json:target/cucumber-reports/TestRunnerHomePage.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty","json:target/cucumber.json"
})
public class TestRunnerHomePage  extends AbstractTestNGCucumberTests{

}
