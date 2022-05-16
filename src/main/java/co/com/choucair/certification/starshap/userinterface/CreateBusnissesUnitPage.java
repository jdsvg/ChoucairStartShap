package co.com.choucair.certification.starshap.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateBusnissesUnitPage extends PageObject {


    public static final Target INTPUT_NAME_NEW_BUSNISSES_UNIT = Target.the("Field where we can write the name of the new Busnisses Unit")
            .located(By.xpath("//div[@id='Serenity_Pro_Organization_BusinessUnitDialog3']//form//div[@class='field Name']//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']"));

    public static final Target TREE_PARENS_UNIT = Target.the("Tree that can show us the parents unit for the new Busnisses Unit")
            .located(By.xpath("//div[@id='Serenity_Pro_Organization_BusinessUnitDialog3']//form//div[@class='field ParentUnitId']//span[@class='select2-arrow']"));

    public static final Target INPUT_PARENT_NEW_BUSNISSES_UNIT = Target.the("Field where we can write the parent of the new Busnisses Unit")
            .located(By.xpath("//div[@id='select2-drop']//input"));

    public static final Target UNIQUE_PAREN_NEW_BUSNISSES_UNIT = Target.the("Unique element taht reference us the name of the paren for the new Busnisses Unit")
            .located(By.xpath("(//div[@id='select2-drop']//ul//li)[1]"));

    public static final Target SAVE_NEW_BUSNISSES_UNIT = Target.the("Button that save the new Busnisses Unit")
            .located(By.xpath("//div[@id='Serenity_Pro_Organization_BusinessUnitDialog3']//div[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar']//span"));


}
