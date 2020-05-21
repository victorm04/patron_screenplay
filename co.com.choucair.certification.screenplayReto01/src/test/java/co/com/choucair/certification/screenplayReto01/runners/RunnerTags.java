package co.com.choucair.certification.screenplayReto01.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/reto01.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certification.screenplayReto01.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}