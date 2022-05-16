package co.com.choucair.certification.starshap.questions;

// Userinterface
import co.com.choucair.certification.starshap.userinterface.SearchBusnissesUnit;
// Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
// Util
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Answer implements Question<Boolean>{

    private String question;


    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = true;

        actor.attemptsTo(
                Enter.theValue(question).into(SearchBusnissesUnit.INPUT_SEARCH_BUSNISSES_UNIT)
        );

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String nameCourse = Text.of(SearchBusnissesUnit.SEARCH_NAME_BUSNISSES_UNIT).viewedBy(actor).asString();
        if (question.equalsIgnoreCase(nameCourse)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
