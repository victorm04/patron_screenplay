package co.com.choucair.certification.screenplayreto02.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DateRegistryPage {

    public static final Target DATEDAY_DP =
            Target.the("Calendar date picker")
                    .located(By.id("datepicker"));
    public static final Target PATIENTID_INPUT =
            Target.the("patient ID text input")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));
    public static final Target DOCTORID_INPUT =
            Target.the("doctor ID text input")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));
    public static final Target OBSERVATION_TEXT =
            Target.the("Observation textatera field")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));
    public static final Target SAVE_BTN =
            Target.the("Save date button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
