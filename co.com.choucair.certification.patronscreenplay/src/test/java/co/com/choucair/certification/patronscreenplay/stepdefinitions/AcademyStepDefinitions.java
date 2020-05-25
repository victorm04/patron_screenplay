package co.com.choucair.certification.patronscreenplay.stepdefinitions;

import co.com.choucair.certification.patronscreenplay.questions.Answer;
import co.com.choucair.certification.patronscreenplay.tasks.Login;
import co.com.choucair.certification.patronscreenplay.tasks.OpenUp;
import co.com.choucair.certification.patronscreenplay.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Victor wants to learn automation at the academy choucair$")
    public void thanVictorWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Victor").wasAbleTo(OpenUp.thePage(),Login.onThePage());
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseCucumberSerenityBDDScreenplayWEBOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledCucumberSerenityBDDScreenplayWEB(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
