package co.com.choucair.certification.starshap.tasks;

// Model
import co.com.choucair.certification.starshap.model.StartSharpData;
// Userinterface
import co.com.choucair.certification.starshap.userinterface.StartSharpPopUpBusnissesUnit;
// Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
// Util
import java.util.List;

public class BusnissesUnit implements Task {

    private List<StartSharpData> dataToForm;


    public BusnissesUnit(List<StartSharpData> data){
        this.dataToForm = data;
    }

    public static BusnissesUnit CreateUnit(List<StartSharpData> data) {

        return Tasks.instrumented(BusnissesUnit.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(dataToForm.get(0).getName_unit()).into(StartSharpPopUpBusnissesUnit.INTPUT_NAME_NEW_BUSNISSES_UNIT)
                ,Click.on(StartSharpPopUpBusnissesUnit.TREE_PARENS_UNIT)
                ,Enter.theValue(dataToForm.get(0).getParent_unit()).into(StartSharpPopUpBusnissesUnit.INPUT_PARENT_NEW_BUSNISSES_UNIT)
                ,Click.on(StartSharpPopUpBusnissesUnit.UNIQUE_PAREN_NEW_BUSNISSES_UNIT)
                ,Click.on(StartSharpPopUpBusnissesUnit.SAVE_NEW_BUSNISSES_UNIT)

        );
    }



}
