package co.com.choucair.certification.screenplayReto01.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoPage extends PageObject {

    public static final Target INPUT_NAME =
            Target.the("name input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
    public static final Target INPUT_LASTNAME =
            Target.the("last name input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
    public static final Target INPUT_ADDRESS =
            Target.the("address input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
    public static final Target INPUT_EMAIL =
            Target.the("Email input field")
                    .located(By.xpath("//*[@id='eid']/input"));
    public static final Target INPUT_PHONE =
            Target.the("phone input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));
    public static final Target RB_MALE =
            Target.the("Gender male radio button")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
    public static final Target RB_FEMALE =
            Target.the("Gender demale radio button")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
    public static final Target CRICKET_CB =
            Target.the("cricket checkbox")
                    .located(By.id("checkbox1"));
    public static final Target MOVIES_CB =
            Target.the("movies checkbox")
                    .located(By.id("checkbox2"));
    public static final Target HOCKEY_CB =
            Target.the("hockey checkbox")
                    .located(By.id("checkbox3"));
    public static final Target LANGUAGE_DD =
            Target.the("languages dropdown")
                    .located(By.id("msdd"));
    public static final Target SKILLS_DD =
            Target.the("skills dropdown")
                    .located(By.id("Skills"));
    public static final Target COUNTRY_DD =
            Target.the("country dropdown")
                    .located(By.id("countries"));
    public static final Target COUNTRY2_DD =
            Target.the("country 2 dropdown")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span"));
    public static final Target YEAR_DD =
            Target.the("year dropdown box")
                    .located(By.id("yearbox"));
    public static final Target MONTH_DD =
            Target.the("month dropdown box")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
    public static final Target DAY_DD =
            Target.the("day dropdown box")
                    .located(By.id("daybox"));
    public static final Target INPUT_PASS =
            Target.the("password input field")
                    .located(By.id("firstpassword"));
    public static final Target INPUT_CPASS =
            Target.the("confirm password input field")
                    .located(By.id("secondpassword"));
    public static final Target BTN_SUBMIT =
            Target.the("submit button")
                    .located(By.id("submitbtn"));
    public static final Target BTN_REFRESH =
            Target.the("refresh button")
                    .located(By.id("Button1"));
}
