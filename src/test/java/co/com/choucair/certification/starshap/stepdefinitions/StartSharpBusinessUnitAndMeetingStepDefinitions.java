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
    public void thanJamesWantsToCreateAnBusinessUnitsAndThenCreateABussni() {
        theActorCalled("James").wasAbleTo(OpenUp.thePage());
    }

    @Given("^he go to login with his credentials$")
    public void heGoToLoginWithHisCredentials(List<StartSharpData> data) {
        theActorInTheSpotlight().attemptsTo(Login.onThePageWith(data));
    }

    // SCENARIO 1
    @Given("^he go to the section (.*)$")
    public void heGoToTheSectionBusinessUnits(String businessunit) {
        theActorInTheSpotlight().attemptsTo(GoToTheSection.aboutOf(businessunit));
    }

    @When("^he is on the Star Sharp platform he will create a new Unit  filling all fields$")
    public void heIsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(List<StartSharpData> businessunit_data){
        theActorInTheSpotlight().attemptsTo(CreateBusnissesUnit.withTheFollowingInformation(businessunit_data));
    }

    @Then("^he see the new (.*) on the tree$")
    public void heSeeTheNewBusinessUnitOnTheTree(String theNew_businessunit_data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.AfterSearching(theNew_businessunit_data)));
    }

    //SCENARIO 2
    @Given("^now he go to the section (.*)")
    public void nowHeGoToTheSectionMeeting(String meetings) {
        theActorInTheSpotlight().attemptsTo(GoToTheSection.aboutOf(meetings));
    }

    @When("^he will to create a new Meeting$")
    public void heWillToCreateANewMeeting(List<StartSharpData> meetings_data) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.withTheFollowingInformation(meetings_data));
    }

    @Then("^he can see the new (.*) on the tree$")
    public void heCanSeeTheNewMeetingJohnVOnTheTree(String theNew_meetings_data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.AfterSearching(theNew_meetings_data)));
    }


}
