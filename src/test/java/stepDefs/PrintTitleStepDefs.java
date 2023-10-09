package stepDefs;

import helpers.PageHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintTitleStepDefs {
    @And("Print page title")
    public void userPageNavigation() {
       PageHelpers.printPageTitle();

    }


}
