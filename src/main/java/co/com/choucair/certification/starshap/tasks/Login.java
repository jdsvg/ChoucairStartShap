package co.com.choucair.certification.starshap.tasks;

// Model
import co.com.choucair.certification.starshap.model.StartSharpData;
// Userinterface
import co.com.choucair.certification.starshap.userinterface.StartSharpLoginPage;
// Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private List<StartSharpData> dataToForm;



    public Login(List<StartSharpData> data){
        this.dataToForm = data;
    }

    public static Login OnThePage(List<StartSharpData> data) {

        return Tasks.instrumented(Login.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(dataToForm.get(0).getUsername()).into(StartSharpLoginPage.INPUT_USERNAME)
                ,Enter.theValue(dataToForm.get(0).getPassword()).into(StartSharpLoginPage.INPUT_PASSWORD)
                ,Click.on(StartSharpLoginPage.BUTTON_SINGI_NG)




//                ,Enter.theValue("myserenity").into(StartSharpLoginPage.X_4)
//                ,Click.on(StartSharpLoginPage.X_5)
//                ,Enter.theValue("Administration").into(StartSharpLoginPage.X_6)
//                ,Click.on(StartSharpLoginPage.X_7)
//                ,Click.on(StartSharpLoginPage.X_8)



        );
    }
}
