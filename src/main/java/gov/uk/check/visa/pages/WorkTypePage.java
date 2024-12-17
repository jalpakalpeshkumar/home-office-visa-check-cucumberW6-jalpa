package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {


    private static final Logger log = Logger.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectJobType(String job){
        clickOnElement(selectJobTypeList);
        log.info("Select JobType : " + selectJobTypeList.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Click NextStep Button : " + nextStepButton.toString());

    }
}
