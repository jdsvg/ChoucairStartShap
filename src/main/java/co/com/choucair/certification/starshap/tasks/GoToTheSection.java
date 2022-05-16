package co.com.choucair.certification.starshap.tasks;

// Userinterface
import co.com.choucair.certification.starshap.userinterface.GoToTheSectionPage;
// Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

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
        if(ToSection.equalsIgnoreCase("Business Units")){
            actor.attemptsTo(
                    Click.on(GoToTheSectionPage.TREE_BUSNISSES_UNIT)
                ,Click.on(GoToTheSectionPage.BUTTON_TO_BUSNISSES_UNIT_SECTION)
                ,Click.on(GoToTheSectionPage.BUTTON_NEW_ITEM)

            );
        }else if(ToSection.equalsIgnoreCase("Meeting")){
            actor.attemptsTo(
                    Click.on(GoToTheSectionPage.TREE_MEETINGS)
                    ,Click.on(GoToTheSectionPage.BUTTON_TO_MEETINGS_SECTION)
                    ,Click.on(GoToTheSectionPage.BUTTON_NEW_ITEM)

            );
        }

    }
}
