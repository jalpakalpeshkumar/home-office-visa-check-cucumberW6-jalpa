package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality Australia")
    public void iSelectANationalityAustralia() {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit("Tourism");
    }

    @Then("I should see result You will not need a visa to come to the UK")
    public void iShouldSeeResultYouWillNotNeedAVisaToComeToTheUK() {
        String expectedResult = "You will not need a visa to come to the UK";
        Assert.assertEquals(new ResultPage().getResultMessage(),expectedResult,"result not displayed");
    }

    @And("I select a Nationality Chile")
    public void iSelectANationalityChile() {
        new SelectNationalityPage().selectNationality("Chile");
    }

    @And("I select reason Work, academic visit or business")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit1("Work, academic visit or business");
    }

    @And("I select intendent to stay for longer than {int} months")
    public void iSelectIntendentToStayForLongerThanMonths(int month) {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");
    }

    @And("I select have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType("'Health and care professional");
    }

    @Then("I should see result You need a visa to work in health and care")
    public void iShouldSeeResultYouNeedAVisaToWorkInHealthAndCare() {
        String expectedResult = "You need a visa to work in health and care";
        Assert.assertEquals(new ResultPage().getMessage(),expectedResult,"Result not displayed");
    }

    @And("I select a nationality Colombia")
    public void iSelectANationalityColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
    }

    @And("I select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForVisit2("Join partner or family for a long stay");
    }

    @And("I Select state My partner of family member have uk immigration status yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("Yes");
    }

    @Then("I should see result You’ll need a visa to join your family or partner in the UK")
    public void iShouldSeeResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        String expectedResult = "You’ll need a visa to join your family or partner in the UK";
        Assert.assertEquals(new ResultPage().youNeedVisaToJoinYourFamily(),expectedResult,"Result not displayed");
    }
}
