package co.com.choucair.certification.screenplayreto02.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/hospitalAdm.feature",
        tags = "@scenario3",
        glue = "co.com.choucair.certification.screenplayreto02.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}