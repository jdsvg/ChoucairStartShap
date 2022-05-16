package co.com.choucair.certification.starshap.userinterface;

// Serenity
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
// Openqa
import org.openqa.selenium.By;

public class StartSharpSections extends PageObject {

    // Arbol de Busnisses Unit (Click)
    public static final Target TREE_BUSNISSES_UNIT = Target.the("Tree where we can see the sections relative to Busnisses Unit")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li//span[@class='s-sidebar-link-text']"));

    // Boton de Busnisses Unit (Click)
    public static final Target BUTTON_TO_BUSNISSES_UNIT_SECTION = Target.the("Button that redirect us to Busnisses Unis section")
            .located(By.xpath("//ul[@id='nav_menu1_3']//li//ul//li//a[@class='s-sidebar-link']"));



    // Boton para la creacion de una nueva Unidad (Click)
    public static final Target BUTTON_NEW_BUSSNISSES_UNIT = Target.the("Button to open the PopUp for create a new Busnisses Section")
            .located(By.xpath("(//span[@class='button-inner'])[1]"));


}
