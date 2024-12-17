package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountryDropdownSteps {
    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> countryDropdown = dataTable.asLists(String.class);
        for (List<String> list :countryDropdown){
            System.out.println(list.get(0));
        }
    }
}
