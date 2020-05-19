package co.com.choucair.certification.patronscreenplay.tasks;

import co.com.choucair.certification.patronscreenplay.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Vrodriguezq").into(ChoucairLoginPage.USER_INPUT),
                Enter.theValue("chc0rr30*").into(ChoucairLoginPage.PASSWORD_INPUT),
                Click.on(ChoucairLoginPage.SUBMIT_BUTTON));
    }

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
}
