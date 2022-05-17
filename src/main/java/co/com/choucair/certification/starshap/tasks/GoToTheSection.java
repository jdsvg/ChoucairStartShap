package co.com.choucair.certification.starshap.tasks;

import co.com.choucair.certification.starshap.userinterface.GoToTheSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class GoToTheSection implements Task {
    private String ToSection;
    public GoToTheSection(String section){
        this.ToSection = section;
    }

    public static GoToTheSection aboutOf(String secton){
        return Tasks.instrumented(GoToTheSection.class, secton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                (Check.whether(ToSection.toString().trim().equals("Business Units")).
                        andIfSo(
                                Click.on(GoToTheSectionPage.TREE_BUSNISSES_UNIT)
                                ,Click.on(GoToTheSectionPage.BUTTON_TO_BUSNISSES_UNIT_SECTION)
                                ,Click.on(GoToTheSectionPage.BUTTON_NEW_ITEM)
                        ).
                        otherwise(
                                Click.on(GoToTheSectionPage.TREE_MEETINGS)
                                ,Click.on(GoToTheSectionPage.BUTTON_TO_MEETINGS_SECTION)
                                ,Click.on(GoToTheSectionPage.BUTTON_NEW_ITEM)
                        )
                )
        );

    }
}
