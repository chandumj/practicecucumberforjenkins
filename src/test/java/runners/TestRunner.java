package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\MphasisPractice Eclipse\\PracticeProjectforCucumber\\src\\test\\java\\features\\homepage.feature", glue = "wikipediasteps", dryRun = false
)
public class TestRunner {

}
