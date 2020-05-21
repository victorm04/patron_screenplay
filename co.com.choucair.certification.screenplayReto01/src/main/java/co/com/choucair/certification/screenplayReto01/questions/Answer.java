package co.com.choucair.certification.screenplayReto01.questions;

import co.com.choucair.certification.screenplayReto01.userinterface.AutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String tittle = Text.of(AutomationDemoPage.TITTLE_STRING).viewedBy(actor).asString();
        if (question.equals(tittle)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
