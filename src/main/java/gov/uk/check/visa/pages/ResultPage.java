package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement needVisaMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement needVisaToJoinFamily;

    public String getResultMessage(){
        return getTextFromElement(resultMessage);

    }

    public String getMessage(){
        return getTextFromElement(needVisaMessage);
    }

    public String youNeedVisaToJoinYourFamily(){
        return getTextFromElement(needVisaToJoinFamily);
    }
}
