package co.com.choucair.certification.screenplayreto02.tasks;

import co.com.choucair.certification.screenplayreto02.model.DateRegisterData;
import co.com.choucair.certification.screenplayreto02.userinterface.DateRegistryPage;
import co.com.choucair.certification.screenplayreto02.userinterface.HospitalAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class DateRegister implements Task {

    private static DateRegisterData dateRegisterData;

    public static DateRegister newDate(List<DateRegisterData> DateRegisterData){
        dateRegisterData = DateRegisterData.get(0);
        return Tasks.instrumented(DateRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HospitalAdminPage.NEWDATE_BTN),
                Enter.theValue(dateRegisterData.getDate()).into(DateRegistryPage.DATEDAY_DP),
                Enter.theValue(dateRegisterData.getPatientID()).into(DateRegistryPage.PATIENTID_INPUT),
                Enter.theValue(dateRegisterData.getDoctorID()).into(DateRegistryPage.DOCTORID_INPUT),
                Enter.theValue(dateRegisterData.getObservations()).into(DateRegistryPage.OBSERVATION_TEXT),
                Click.on(DateRegistryPage.SAVE_BTN));
    }
}
