package co.com.choucair.certification.starshap.questions;

import co.com.choucair.certification.starshap.userinterface.SearchItem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import java.util.concurrent.TimeUnit;

public class TheAnswer implements Question<Boolean>{
    private String question;

    public TheAnswer(String question) {
        this.question = question;
    }

    public static TheAnswer onThePageAboutOf(String question) {
        return new TheAnswer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = true;

        actor.attemptsTo(Enter.theValue(question).into(SearchItem.INPUT_SEARCH));

        try {TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}

        String nameCourse = Text.of(SearchItem.SEARCH_ITEM).viewedBy(actor).asString();
        if (question.equalsIgnoreCase(nameCourse)){result = true;
        }else{result = false;}

        return result;
    }
}
