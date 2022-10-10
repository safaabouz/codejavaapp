package logInTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="uses_cases",
		monochrome=true,
	    snippets =SnippetType.CAMELCASE,
	    
		glue = {" logInTests"},
		plugin = {"html:target/cucumber/wikipedia.html"})
public class AcceptanceTest {

}
