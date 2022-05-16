package co.com.choucair.certification.starshap.tasks;

// Userinterface
import co.com.choucair.certification.starshap.userinterface.StartSharpSections;
// Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class TheSection implements Task {


    private String ToSection;
    public TheSection(String section){
        this.ToSection = section;
    }

    public static TheSection about(String secton){
        return Tasks.instrumented(TheSection.class, secton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(ToSection.equalsIgnoreCase("Business Units")){
            actor.attemptsTo(
                    Click.on(StartSharpSections.TREE_BUSNISSES_UNIT)
                ,Click.on(StartSharpSections.BUTTON_TO_BUSNISSES_UNIT_SECTION)
                ,Click.on(StartSharpSections.BUTTON_NEW_BUSSNISSES_UNIT)

            );
        }else if(ToSection.equalsIgnoreCase("Meetings")){

        }

    }
}
