package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement reasonForVisitList1;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reasonForVisitList2;


    public void selectReasonForVisit(String reason){
        clickOnElement(reasonForVisitList);
        log.info("Select Reason For Visit : " + reasonForVisitList.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Click NextStep Button : " + nextStepButton.toString());
    }

    public void selectReasonForVisit1(String reason){
        clickOnElement(reasonForVisitList1);
        log.info("Select Reason For Visit1 : " + reasonForVisitList1.toString());
    }

    public void selectReasonForVisit2(String reason){
        clickOnElement(reasonForVisitList2);
        log.info("Select Reason For Visit2 : " + reasonForVisitList2.toString());
    }
}
