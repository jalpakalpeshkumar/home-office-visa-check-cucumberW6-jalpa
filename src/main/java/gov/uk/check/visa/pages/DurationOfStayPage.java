package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-2")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess) {
            case "6 months or less":
                lessThanSixMonths.click();
                break;
            case "longer than 6 months":
                moreThanSixMonths.click();
                break;
            default:
                System.out.println("Invalid duration: " + moreOrLess);
        }
        log.info("Select Length Of Stay : " +moreThanSixMonths.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Click NextStep Button : " + nextStepButton.toString());
    }
}
