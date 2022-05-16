package co.com.choucair.certification.starshap.stepdefinitions;

// Model
import co.com.choucair.certification.starshap.model.StartSharpData;
// Question
import co.com.choucair.certification.starshap.questions.Answer;
// Tasks
import co.com.choucair.certification.starshap.tasks.*;
// Cucumber
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
    public void heGoToLoginWithHisCredentials(List<StartSharpData> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.OnThePage(data)
        );
    }



    // SCENARIO 1
    @Given("^he go to the section (.*)$")
    public void heGoToTheSectionBusinessUnits(String section) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
            TheSection.about(section)
        );

    }

    @When("^he is on the Star Sharp platform he will create a new Unit  filling all fields$")
//    public void heGoToTheSectionBusinessUnitsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(DataTable arg1) throws Exception {
    public void heIsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(List<StartSharpData> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BusnissesUnit.CreateUnit(data)
        );

    }

    @Then("^he see the new (.*) on the tree$")
    public void heSeeTheNewBusinessUnitOnTheTree(String data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));

    }


    //SCENARIO 2
    @Given("^now he go to the section (.*)")
    public void nowHeGoToTheSectionMeeting(String section) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TheSection.about(section)
        );

    }


    @When("^he will to create a new Meeting$")
    public void heWillToCreateANewMeeting(List<StartSharpData> data) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Meeting.CreateMeeting(data)
        );



    }

    @Then("^he can see the new (.*) on the tree$")
    public void heCanSeeTheNewMeetingJohnVOnTheTree(String data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));

    }


}
