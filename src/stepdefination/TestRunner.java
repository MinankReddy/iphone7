package stepdefination;
	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;


	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Feature",
			glue={"stepdefination"},
			//plugin = { "pretty", "html:Reports" }
			//dryRun = true,
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-reports/report.html"}
			//tags= {"@Regression"}

			)
	public class TestRunner {
	 

}
