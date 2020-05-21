package co.com.choucair.certification.screenplayReto01.stepdefinitions;

import co.com.choucair.certification.screenplayReto01.model.RegisterData;
import co.com.choucair.certification.screenplayReto01.questions.Answer;
import co.com.choucair.certification.screenplayReto01.tasks.OpenUp;
import co.com.choucair.certification.screenplayReto01.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Reto01Stepdefinition {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to access to the Web Automation Demo Site$")
    public void thanCarlosWantsToAccessToTheWebAutomationDemoSite() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he does the register on the site$")
    public void heDoesTheRegisterOnTheSite(List<RegisterData> Registerdata) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.inTheSite(Registerdata));
    }

    @Then("^he verify that the page loaded has the text (.*)$")
    public void heVerifyThatThePageLoadedHasTheTextDoubleClickOnEditIconToEDITTheTableRow(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
