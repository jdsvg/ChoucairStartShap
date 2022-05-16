package co.com.choucair.certification.starshap.tasks;

import co.com.choucair.certification.starshap.model.StartSharpData;
import co.com.choucair.certification.starshap.userinterface.CreateMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateMeeting implements Task {
    private List<StartSharpData> dataToForm;

    public CreateMeeting(List<StartSharpData> data){
        this.dataToForm = data;
    }

    public static CreateMeeting create(List<StartSharpData> data) {

        return Tasks.instrumented(CreateMeeting.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(dataToForm.get(0).getName_meeting()).into(CreateMeetingPage.INTPUT_NAME_NEW_MEETING)
                ,Enter.theValue(dataToForm.get(0).getNumber_meeting()).into(CreateMeetingPage.INTPUT_NUMBER_NEW_MEETING)


                ,Click.on(CreateMeetingPage.SPAN_MEETING_TYPE)
                ,Enter.theValue(dataToForm.get(0).getType_meeting()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)

                ,Click.on(CreateMeetingPage.SPAN_LOCATION)
                ,Enter.theValue(dataToForm.get(0).getLocation()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)

                ,Click.on(CreateMeetingPage.SPAN_UNIT)
                ,Enter.theValue(dataToForm.get(0).getUnit()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)

                ,Click.on(CreateMeetingPage.SPAN_ORGANIZE_BY)
                ,Enter.theValue(dataToForm.get(0).getOrganized_by()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)

                ,Click.on(CreateMeetingPage.SPAN_REPORTER)
                ,Enter.theValue(dataToForm.get(0).getReporter()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)

                ,Click.on(CreateMeetingPage.SPAN_ATTENDEE_LIST)
                ,Enter.theValue(dataToForm.get(0).getAttendee_list()).into(CreateMeetingPage.INPUT_SEARCHING)
                ,Click.on(CreateMeetingPage.UNIQUE_SELECT_ON_TREE)


                ,Enter.theValue(dataToForm.get(0).getStart_date()).into(CreateMeetingPage.INPUT_START_DATE)
                ,Enter.theValue(dataToForm.get(0).getEnd_date()).into(CreateMeetingPage.INPUT_END_DATE)


                ,SelectFromOptions.byVisibleText(dataToForm.get(0).getStart_hour()).from(CreateMeetingPage.SELECT_START_HOUR)
                ,SelectFromOptions.byVisibleText(dataToForm.get(0).getEnd_hour()).from(CreateMeetingPage.SELECT_END_HOUR)


                ,Click.on(CreateMeetingPage.SAVE_NEW_MEETING)

        );

        try {TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}

    }
}
