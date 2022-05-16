package co.com.choucair.certification.starshap.userinterface;

// Serenity
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
// Openqa
import org.openqa.selenium.By;

public class StartSharpLoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input where  do we write the username")
            .located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']"));

    public static final Target INPUT_PASSWORD = Target.the("Input where  do we write the password")
            .located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']"));

    public static final Target BUTTON_SINGI_NG = Target.the("Button to  sing in the page")
            .located(By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']"));












}
