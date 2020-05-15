package co.com.choucair.certification.screenplay.stepdefinitions;

import co.com.choucair.certification.screenplay.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Victor wants to learn automation at the academy choucair$")
    public void thanVictorWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Victor").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the course Cucumber - SerenityBDD \\+ Screenplay \\(WEB\\) on the choucair academy platform$")
    public void heSearchForTheCourseCucumberSerenityBDDScreenplayWEBOnTheChoucairAcademyPlatform() {
    }

    @Then("^he finds the course called Cucumber - SerenityBDD \\+ Screenplay \\(WEB\\)$")
    public void heFindsTheCourseCalledCucumberSerenityBDDScreenplayWEB() {
    }
}
