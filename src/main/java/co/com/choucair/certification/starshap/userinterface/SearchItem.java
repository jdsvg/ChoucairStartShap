package co.com.choucair.certification.starshap.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchItem extends PageObject {
    public static final Target INPUT_SEARCH = Target.the("Input for write the name of the new Busnisses Unit").
            located(By.className("s-Serenity-QuickSearchInput"));
    public static final Target SEARCH_ITEM = Target.the("Name of the Bussnises Unit").located(
            By.cssSelector("div.slick-cell.l1.r1 a")
    );
}
