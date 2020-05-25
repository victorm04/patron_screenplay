package co.com.choucair.certification.screenplayreto02.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HospitalAdminPage extends PageObject {

    public static final Target NEWDOCTOR_BTN =
            Target.the("add new doctor button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
    public static final Target NEWPATIENT_BTN =
            Target.the("add new patient button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
    public static final Target NEWDATE_BTN =
            Target.the("create new date button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
    public static final Target VERIFY_LBL =
            Target.the("doctor's add verify label")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]/p"));
}
