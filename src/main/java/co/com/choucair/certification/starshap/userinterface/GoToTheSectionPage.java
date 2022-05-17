package co.com.choucair.certification.starshap.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToTheSectionPage extends PageObject {

    //BUSNISSES UNIT
    public static final Target TREE_BUSNISSES_UNIT = Target.the("Tree where we can see the sections relative to Busnisses Unit")
            .located(By.cssSelector("ul#nav_menu1_3 li span"));
    public static final Target BUTTON_TO_BUSNISSES_UNIT_SECTION = Target.the("Button that redirect us to Busnisses Unis section")
            .located(By.cssSelector("ul#nav_menu1_3_1 li a"));
    //MEETINGS
    public static final Target TREE_MEETINGS = Target.the("Tree where we can see the sections relative to Meetings")
            .located(By.cssSelector("ul#nav_menu1_3 > li + li span"));
    public static final Target BUTTON_TO_MEETINGS_SECTION = Target.the("Button that redirect us to Meetings section")
            .located(By.cssSelector("ul#nav_menu1_3_2 li a"));

    public static final Target BUTTON_NEW_ITEM = Target.the("Button to open the PopUp for create a new item")
            .located(By.cssSelector("div.tool-button.add-button.icon-tool-button span"));

}
