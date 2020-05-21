package co.com.choucair.certification.screenplayReto01.tasks;

import co.com.choucair.certification.screenplayReto01.model.RegisterData;
import co.com.choucair.certification.screenplayReto01.userinterface.AutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Register implements Task {

    RegisterData datos;

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("entre aqui-------------------------------");

        actor.attemptsTo(Enter.theValue(datos.getName()).into(AutomationDemoPage.INPUT_NAME),
                Enter.theValue(datos.getLastname()).into(AutomationDemoPage.INPUT_LASTNAME),
                Enter.theValue(datos.getAddress()).into(AutomationDemoPage.INPUT_ADDRESS),
                Enter.theValue(datos.getPhone()).into(AutomationDemoPage.INPUT_PHONE),
                SelectFromOptions.byValue(datos.getLanguage1()).from(AutomationDemoPage.LANGUAGE_DD),
                SelectFromOptions.byValue(datos.getLanguage2()).from(AutomationDemoPage.LANGUAGE_DD),
                SelectFromOptions.byValue(datos.getSkills()).from(AutomationDemoPage.SKILLS_DD),
                SelectFromOptions.byValue(datos.getCountry()).from(AutomationDemoPage.COUNTRY_DD),
                SelectFromOptions.byValue(datos.getCountry2()).from(AutomationDemoPage.COUNTRY2_DD),
                SelectFromOptions.byValue(datos.getYear()).from(AutomationDemoPage.YEAR_DD),
                SelectFromOptions.byValue(datos.getMonth()).from(AutomationDemoPage.MONTH_DD),
                SelectFromOptions.byValue(datos.getDay()).from(AutomationDemoPage.DAY_DD),
                Enter.theValue(datos.getPassword()).into(AutomationDemoPage.INPUT_PASS),
                Enter.theValue(datos.getCpassword()).into(AutomationDemoPage.INPUT_CPASS));
        if((datos.getHobbie1() == "Hockey") || (datos.getHobbie2() == "Hockey")){
            actor.attemptsTo(Click.on(AutomationDemoPage.HOCKEY_CB));
        }
        if((datos.getHobbie1() == "Cricket") || (datos.getHobbie2() == "Cricket")){
            actor.attemptsTo(Click.on(AutomationDemoPage.CRICKET_CB));
        }
        if((datos.getHobbie1() == "Movies") || (datos.getHobbie2() == "Movies")){
            actor.attemptsTo(Click.on(AutomationDemoPage.MOVIES_CB));
        }
        if(datos.getGender() == "Male") {
            actor.attemptsTo(Click.on(AutomationDemoPage.RB_MALE));
        }
        if(datos.getGender() == "Female") {
            actor.attemptsTo(Click.on(AutomationDemoPage.RB_FEMALE));
        }

        actor.attemptsTo(Click.on(AutomationDemoPage.BTN_SUBMIT));
    }

    public static Register inTheSite(List<RegisterData> RegisterData) {

        System.out.println("entre in the site-------------------------------");
        return Tasks.instrumented(Register.class);
    }
}
