package co.com.choucair.certification.screenplayreto02.tasks;

import co.com.choucair.certification.screenplayreto02.model.DoctorRegisterData;
import co.com.choucair.certification.screenplayreto02.userinterface.DoctorRegistryPage;
import co.com.choucair.certification.screenplayreto02.userinterface.HospitalAdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class DoctorRegister implements Task {

    private static DoctorRegisterData doctorRegisterData;

    public static DoctorRegister newDoctor(List<DoctorRegisterData> DoctorRegisterData) {
        doctorRegisterData = DoctorRegisterData.get(0);
        return Tasks.instrumented(DoctorRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HospitalAdminPage.NEWDOCTOR_BTN),
                Enter.theValue(doctorRegisterData.getName()).into(DoctorRegistryPage.NAME_INPUT),
                Enter.theValue(doctorRegisterData.getLastname()).into(DoctorRegistryPage.LASTNAME_INPUT),
                Enter.theValue(doctorRegisterData.getPhone()).into(DoctorRegistryPage.PHONE_INPUT),
                SelectFromOptions.byVisibleText(doctorRegisterData.getDocType()).from(DoctorRegistryPage.IDTYPE_DROP),
                Enter.theValue(doctorRegisterData.getDocNumber()).into(DoctorRegistryPage.ID_INPUT),
                Click.on(DoctorRegistryPage.SAVE_BTN));
    }
}
