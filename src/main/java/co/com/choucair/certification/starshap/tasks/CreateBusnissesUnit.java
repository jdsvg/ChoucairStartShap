package co.com.choucair.certification.starshap.tasks;

import co.com.choucair.certification.starshap.model.StartSharpData;
import co.com.choucair.certification.starshap.userinterface.CreateBusnissesUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class CreateBusnissesUnit implements Task {
    private List<StartSharpData> dataToForm;
    public CreateBusnissesUnit(List<StartSharpData> data){
        this.dataToForm = data;
    }

    public static CreateBusnissesUnit createWith(List<StartSharpData> data) {
        return Tasks.instrumented(CreateBusnissesUnit.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataToForm.get(0).getName_unit()).into(CreateBusnissesUnitPage.INTPUT_NAME_NEW_BUSNISSES_UNIT)
                ,Click.on(CreateBusnissesUnitPage.TREE_PARENS_UNIT)
                ,Enter.theValue(dataToForm.get(0).getParent_unit()).into(CreateBusnissesUnitPage.INPUT_PARENT_NEW_BUSNISSES_UNIT)
                ,Click.on(CreateBusnissesUnitPage.UNIQUE_PAREN_NEW_BUSNISSES_UNIT)
                ,Click.on(CreateBusnissesUnitPage.SAVE_NEW_BUSNISSES_UNIT)
        );
    }



}
