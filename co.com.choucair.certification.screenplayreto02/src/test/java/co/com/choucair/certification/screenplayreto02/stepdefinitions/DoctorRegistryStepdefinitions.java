package co.com.choucair.certification.screenplayreto02.stepdefinitions;

import co.com.choucair.certification.screenplayreto02.model.DateRegisterData;
import co.com.choucair.certification.screenplayreto02.model.DoctorRegisterData;
import co.com.choucair.certification.screenplayreto02.model.PatientRegisterData;
import co.com.choucair.certification.screenplayreto02.questions.Answer;
import co.com.choucair.certification.screenplayreto02.tasks.DateRegister;
import co.com.choucair.certification.screenplayreto02.tasks.OpenUp;
import co.com.choucair.certification.screenplayreto02.tasks.DoctorRegister;
import co.com.choucair.certification.screenplayreto02.tasks.PatientRegister;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class DoctorRegistryStepdefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Carlos need to register a new doctor$")
    public void thanCarlosNeedToRegisterANewDoctor() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the doctor registry form in the app$")
    public void heFillTheDoctorRegistryFormInTheApp(List<DoctorRegisterData> DoctorRegisterData) {
        OnStage.theActorInTheSpotlight().attemptsTo(DoctorRegister.newDoctor(DoctorRegisterData));
    }

    @Then("^he verify that the screen show the mesage (.*)$")
    public void heVerifyThatTheScreenShowTheMesageDatosGuardadosCorrectamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theRegistryValidation(question)));
    }

    @Given("^than Carlos add a new patient$")
    public void thanCarlosAddANewPatient() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the patient registry form in the app$")
    public void heFillThePatientRegistryFormInTheApp(List<PatientRegisterData> PatientRegisterData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PatientRegister.newPatient(PatientRegisterData));
    }

    @Given("^than Carlos want to make a new date$")
    public void thanCarlosWantToMakeANewDate() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the date registry form in the app$")
    public void heFillTheDateRegistryFormInTheApp(List<DateRegisterData> DateRegisterData) {
        OnStage.theActorInTheSpotlight().attemptsTo(DateRegister.newDate(DateRegisterData));
    }
}
