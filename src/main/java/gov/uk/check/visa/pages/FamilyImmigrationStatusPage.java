package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement yes;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                yes.click();
                break;
            case "No":
                no.click();
                break;
            default:
                System.out.println("Invalid status: " + status);
        }
        log.info("Select Immigration Status : " + yes.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Click NextStep Button : " + nextStepButton.toString());
    }
}
