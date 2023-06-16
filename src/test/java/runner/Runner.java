package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/runner/req.feature",glue={"stepdefenition"},plugin="html:target/HtmlReports.html")

public class Runner {

}
