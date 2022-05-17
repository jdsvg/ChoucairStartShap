package co.com.choucair.certification.starshap.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/start_sharp.feature",
        tags = "@Scenario2",
        glue = "co.com.choucair.certification.starshap.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class Runner {

}
