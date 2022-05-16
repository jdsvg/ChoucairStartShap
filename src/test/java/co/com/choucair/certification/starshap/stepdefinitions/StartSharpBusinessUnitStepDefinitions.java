package co.com.choucair.certification.starshap.stepdefinitions;

// Cucumber
import co.com.choucair.certification.starshap.tasks.Login;
import co.com.choucair.certification.starshap.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// Serenity
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
// Util
import java.util.List;

public class StartSharpBusinessUnitStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    // BACKGROUND
    @Given("^than James wants to create an Business Units and then create a meeting$")
    public void thanJamesWantsToCreateAnBusinessUnitsAndThenCreateABussni() throws Exception {
        OnStage.theActorCalled("James").wasAbleTo(
                OpenUp.thePage()
        );

    }
    @Given("^he go to login with his credentials$")
//    public void heGoToLoginWithHisCredentials(DataTable arg1) throws Exception {
    public void heGoToLoginWithHisCredentials() throws Exception {
        OnStage.theActorCalled("James").wasAbleTo(
                Login.OnThePage()
        );

    }




    @Given("^he go to the section Business Units$")
    public void heGoToTheSectionBusinessUnits() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^he go to the section Business Units on the Star Sharp platform he will create a new Unit  filling all fields$")
//    public void heGoToTheSectionBusinessUnitsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(DataTable arg1) throws Exception {
    public void heGoToTheSectionBusinessUnitsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @Then("^he see the new Business Unit on the tree$")
    public void heSeeTheNewBusinessUnitOnTheTree() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }




}
