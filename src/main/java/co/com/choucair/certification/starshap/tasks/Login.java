package co.com.choucair.certification.starshap.tasks;

import co.com.choucair.certification.starshap.model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static co.com.choucair.certification.starshap.userinterface.LoginPage.*;

public class Login implements Task {
    private List<StartSharpData> dataToForm;
    public Login(List<StartSharpData> data){
        this.dataToForm = data;
    }

    public static Login onThePageWith(List<StartSharpData> data) {

        return Tasks.instrumented(Login.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataToForm.get(0).getUsername()).into(INPUT_USERNAME)
                ,Enter.theValue(dataToForm.get(0).getPassword()).into(INPUT_PASSWORD)
                ,Click.on(BUTTON_SINGI_NG)
        );
    }
}
