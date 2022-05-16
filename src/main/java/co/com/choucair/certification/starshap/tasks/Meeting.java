package co.com.choucair.certification.starshap.tasks;


// Model
import co.com.choucair.certification.starshap.model.StartSharpData;
// Serenity
import co.com.choucair.certification.starshap.userinterface.StartSharpPopUpBusnissesUnit;
import co.com.choucair.certification.starshap.userinterface.StartSharpPopUpMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
// Util
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Meeting implements Task {

    private List<StartSharpData> dataToForm;

    public Meeting(List<StartSharpData> data){
        this.dataToForm = data;
    }


    public static Meeting CreateMeeting(List<StartSharpData> data) {

        return Tasks.instrumented(Meeting.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(dataToForm.get(0).getName_meeting()).into(StartSharpPopUpMeeting.INTPUT_NAME_NEW_MEETING)
                ,Enter.theValue(dataToForm.get(0).getNumber_meeting()).into(StartSharpPopUpMeeting.INTPUT_NUMBER_NEW_MEETING)


                ,Click.on(StartSharpPopUpMeeting.SPAN_MEETING_TYPE)
                ,Enter.theValue(dataToForm.get(0).getType_meeting()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)

                ,Click.on(StartSharpPopUpMeeting.SPAN_LOCATION)
                ,Enter.theValue(dataToForm.get(0).getLocation()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)

                ,Click.on(StartSharpPopUpMeeting.SPAN_UNIT)
                ,Enter.theValue(dataToForm.get(0).getUnit()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)

                ,Click.on(StartSharpPopUpMeeting.SPAN_ORGANIZE_BY)
                ,Enter.theValue(dataToForm.get(0).getOrganized_by()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)

                ,Click.on(StartSharpPopUpMeeting.SPAN_REPORTER)
                ,Enter.theValue(dataToForm.get(0).getReporter()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)

                ,Click.on(StartSharpPopUpMeeting.SPAN_ATTENDEE_LIST)
                ,Enter.theValue(dataToForm.get(0).getAttendee_list()).into(StartSharpPopUpMeeting.INPUT_SEARCHING)
                ,Click.on(StartSharpPopUpMeeting.UNIQUE_SELECT_ON_TREE)


                ,Enter.theValue(dataToForm.get(0).getStart_date()).into(StartSharpPopUpMeeting.INPUT_START_DATE)
                ,Enter.theValue(dataToForm.get(0).getEnd_date()).into(StartSharpPopUpMeeting.INPUT_END_DATE)


//                ,Click.on(StartSharpPopUpMeeting.SELECT_START_HOUR)
//                ,Click.on(StartSharpPopUpMeeting.OPTION_START_HOUR)
//                ,Click.on(StartSharpPopUpMeeting.SELECT_END_HOUR)
//                ,Click.on(StartSharpPopUpMeeting.OPTION_END_HOUR)


                ,Click.on(StartSharpPopUpMeeting.SAVE_NEW_MEETING)

        );


        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
