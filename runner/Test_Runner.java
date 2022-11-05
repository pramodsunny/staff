package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {".//src//test//java"},
		glue = "step_definations",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty","html:target/HTMLReports/report.html"
		}
	//	tags = "@Execute"
		)

public class Test_Runner extends AbstractTestNGCucumberTests{

}
