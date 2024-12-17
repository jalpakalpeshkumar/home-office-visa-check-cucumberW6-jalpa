package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {


    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropdownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropdownList,nationality);
        log.info("Select Nationality : " + nationalityDropdownList.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Click NextStep Button : " + nextStepButton.toString());
    }
}
