package co.com.choucair.certification.patronscreenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target CHOUCAIR_ACADEMY =
            Target.the("University link button")
                    .located(By.xpath("//*[@id='universidad']/a/img"));
    public static final Target SEARCH_INPUT =
            Target.the("Cuadro de busqueda de cursos")
                    .located(By.id("coursesearchbox"));
    public static final Target BTN_GO =
            Target.the("Botón para ejecutar la busqueda del curso")
                    .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target SELECTED_COURSE =
            Target.the("Curso seleccionado")
                    .located(By.xpath("//H4[text()='Cucumber - SerenityBDD + Screenplay (WEB)']"));
    public static final Target NAME_COURSE =
            Target.the("Titulo del curso seleccionado")
                    .located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div/a/div/div/h1"));
}
