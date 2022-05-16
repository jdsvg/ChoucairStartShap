package co.com.choucair.certification.starshap.userinterface;

// Serenity
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
// Openqa
import org.openqa.selenium.By;

public class GoToTheSectionPage extends PageObject {


    //BUSNISSES UNIT
    public static final Target TREE_BUSNISSES_UNIT = Target.the("Tree where we can see the sections relative to Busnisses Unit")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li//span[@class='s-sidebar-link-text']"));

    public static final Target BUTTON_TO_BUSNISSES_UNIT_SECTION = Target.the("Button that redirect us to Busnisses Unis section")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li//ul//li//a[@class='s-sidebar-link']"));


    //MEETINGS
    public static final Target TREE_MEETINGS = Target.the("Tree where we can see the sections relative to Meetings")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li[@Class='s-sidebar-item has-children'][2]//span[@class='s-sidebar-link-text']"));

    public static final Target BUTTON_TO_MEETINGS_SECTION = Target.the("Button that redirect us to Meetings section")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li[@Class='s-sidebar-item has-children'][2]//ul//li//a[@class='s-sidebar-link']"));

    public static final Target BUTTON_NEW_MEETING = Target.the("Button to open the PopUp for create a new Meetings Section")
            .located(By.xpath("(//span[@class='button-inner'])[1]"));

    public static final Target BUTTON_NEW_ITEM = Target.the("Button to open the PopUp for create a new item")
            .located(By.xpath("(//span[@class='button-inner'])[1]"));


}
