package co.com.choucair.certification.starshap.tasks;

import co.com.choucair.certification.starshap.userinterface.StartSharpLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {


    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue("admin").into(StartSharpLoginPage.INPUT_USERNAME)
                ,Enter.theValue("serenity").into(StartSharpLoginPage.INPUT_PASSWORD)
                ,Click.on(StartSharpLoginPage.BUTTON_SINGI_NG)




        );
    }
}
