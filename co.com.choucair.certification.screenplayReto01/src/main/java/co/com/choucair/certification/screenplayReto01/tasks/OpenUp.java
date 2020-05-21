package co.com.choucair.certification.screenplayReto01.tasks;

import co.com.choucair.certification.screenplayReto01.userinterface.AutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    AutomationDemoPage automationDemoPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoPage));
    }

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
}
