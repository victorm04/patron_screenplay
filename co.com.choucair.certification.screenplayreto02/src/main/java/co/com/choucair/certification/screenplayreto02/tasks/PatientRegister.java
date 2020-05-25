package co.com.choucair.certification.screenplayreto02.tasks;

import co.com.choucair.certification.screenplayreto02.model.PatientRegisterData;
import co.com.choucair.certification.screenplayreto02.userinterface.HospitalAdminPage;
import co.com.choucair.certification.screenplayreto02.userinterface.PatientRegistryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class PatientRegister implements Task {

    private static PatientRegisterData patientRegisterData;

    public static PatientRegister newPatient(List<PatientRegisterData> PatientRegisterData) {
        patientRegisterData = PatientRegisterData.get(0);
        return Tasks.instrumented(PatientRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HospitalAdminPage.NEWPATIENT_BTN),
                Enter.theValue(patientRegisterData.getName()).into(PatientRegistryPage.NAME_INPUT),
                Enter.theValue(patientRegisterData.getLastname()).into(PatientRegistryPage.LASTNAME_INPUT),
                Enter.theValue(patientRegisterData.getPhone()).into(PatientRegistryPage.PHONE_NUMBER),
                SelectFromOptions.byVisibleText(patientRegisterData.getDocType()).from(PatientRegistryPage.IDTYPE_DROP),
                Enter.theValue(patientRegisterData.getDocNumber()).into(PatientRegistryPage.ID_INPUT)
                );
        if(patientRegisterData.getPrepaid().equals("si")){
            actor.attemptsTo(Click.on(PatientRegistryPage.PRAPAYD_CB));
        }
        actor.attemptsTo(Click.on(PatientRegistryPage.SAVE_BTN));
    }
}
