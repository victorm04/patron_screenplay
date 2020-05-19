package co.com.choucair.certification.patronscreenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON =
            Target.the("Button that shows us the form to login")
                    .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));
    public static final Target USER_INPUT =
            Target.the("Username input")
                    .located(By.id("username"));
    public static final Target PASSWORD_INPUT =
            Target.the("Password input")
                    .located(By.id("password"));
    public static final Target SUBMIT_BUTTON =
            Target.the("Login button")
                    .located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"));

}
