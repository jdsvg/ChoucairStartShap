package co.com.choucair.certification.starshap.stepdefinitions;

import co.com.choucair.certification.starshap.model.StartSharpData;
import co.com.choucair.certification.starshap.questions.TheAnswer;
import co.com.choucair.certification.starshap.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StartSharpBusinessUnitAndMeetingStepDefinitions {


    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    // BACKGROUND
    @Given("^than James wants to create an Business Units and then create a meeting$")
    public void thanJamesWantsToCreateAnBusinessUnitsAndThenCreateABussni() throws Exception {
        theActorCalled("James").wasAbleTo(OpenUp.thePage());
    }
    @Given("^he go to login with his credentials$")
    public void heGoToLoginWithHisCredentials(List<StartSharpData> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(Login.onThePageWith(data));
    }



    // SCENARIO 1
    @Given("^he go to the section (.*)$")
    public void heGoToTheSectionBusinessUnits(String section) throws Exception {
        theActorInTheSpotlight().attemptsTo(GoToTheSection.aboutOf(section));
    }

    @When("^he is on the Star Sharp platform he will create a new Unit  filling all fields$")
    public void heIsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(List<StartSharpData> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(CreateBusnissesUnit.withTheFollowingInformation(data));
    }

    @Then("^he see the new (.*) on the tree$")
    public void heSeeTheNewBusinessUnitOnTheTree(String data) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.AfterSearching(data)));
    }


    //SCENARIO 2
    @Given("^now he go to the section (.*)")
    public void nowHeGoToTheSectionMeeting(String section) throws Exception {
        theActorInTheSpotlight().attemptsTo(GoToTheSection.aboutOf(section));
    }


    @When("^he will to create a new Meeting$")
    public void heWillToCreateANewMeeting(List<StartSharpData> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.withTheFollowingInformation(data));
    }

    @Then("^he can see the new (.*) on the tree$")
    public void heCanSeeTheNewMeetingJohnVOnTheTree(String data) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.AfterSearching(data)));
    }


}
