package co.com.choucair.certification.starshap.userinterface;


// Serenity
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
// Openqa
import org.openqa.selenium.By;


public class StartSharpPopUpMeeting extends PageObject {

    public static final Target INTPUT_NAME_NEW_MEETING = Target.the("Field where we can write the name of the new Meeting")
            .located(By.xpath("//input[@name='MeetingName']"));

    public static final Target INTPUT_NUMBER_NEW_MEETING = Target.the("Field where we can write the number of the new Meeting")
            .located(By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']"));






    public static final Target SPAN_MEETING_TYPE = Target.the("Tree that can show us the types for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-6']"));

    public static final Target SPAN_LOCATION = Target.the("Tree that can show us the location for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-7']"));

    public static final Target SPAN_UNIT = Target.the("Tree that can show us the unit for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-8']"));

    public static final Target SPAN_ORGANIZE_BY = Target.the("Tree that can show us the organization for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-9']"));

    public static final Target SPAN_REPORTER = Target.the("Tree that can show us the reporter for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-10']"));

    public static final Target SPAN_ATTENDEE_LIST = Target.the("Tree that can show us the attendee list for the new Meeting")
            .located(By.xpath("//span[@id='select2-chosen-12']"));


//div[@class='field AttendeeList']//span










    public static final Target INPUT_START_DATE = Target.the("Field where we can write the start date of the new Meeting")
            .located(By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']"));

    public static final Target INPUT_END_DATE = Target.the("Field where we can write the end date of the new Meeting")
            .located(By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']"));






    public static final Target SELECT_START_HOUR = Target.the("List that can show us the options of start hours for the new Meeting")
            .located(By.xpath("//select[@Class='editor s-DateTimeEditor time valid']"));
    public static final Target OPTION_START_HOUR = Target.the("Start hour option for the new Meeting")
            .located(By.xpath("//select[@Class='editor s-DateTimeEditor time valid']//option[20]"));


    public static final Target SELECT_END_HOUR = Target.the("List that can show us the options of end hours for the new Meeting")
            .located(By.xpath("//select[@Class='editor s-DateTimeEditor time']"));
    public static final Target OPTION_END_HOUR = Target.the("End hour option for the new Meeting")
            .located(By.xpath("//select[@Class='editor s-DateTimeEditor time']//option[27]"));










    public static final Target INPUT_SEARCHING = Target.the("Tree that can show us the types for the new Meeting")
            .located(By.xpath("//div[@id='select2-drop']//input"));

    public static final Target UNIQUE_SELECT_ON_TREE = Target.the("Tree that can show us the types for the new Meeting")
            .located(By.xpath("//div[@id='select2-drop']//ul//li[1]"));





    public static final Target SAVE_NEW_MEETING = Target.the("Button that save the new Meeting")
            .located(By.xpath("//div[@class='s-DialogToolbar s-Serenity-Toolbar s-Toolbar clearfix']//span"));






}
