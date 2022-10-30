package com.stepDefinitions;

import com.browser.DriverManager;
import com.steps.ComplicatedSteps;
import io.cucumber.java.en.*;

public class firstDefSteps {

    ComplicatedSteps complicatedSteps;

    @Given("The user is on the Homepage")
    public void the_user_is_on_the_homepage() {

        DriverManager d = new DriverManager();
        d.launchBrowser();

    }
    @When("The User click the dress option")
    public void the_user_click_the_dress_option() {
        complicatedSteps.clickDressOption();
    }
    @Then("the user click the casual dress option")
    public void the_user_click_the_casual_dress_option() {
       complicatedSteps.clickCasualDress();
    }
    @Then("the user click the pinted dress")
    public void the_user_click_the_pinted_dress() {
        complicatedSteps.clickPrinttedDress();
    }
    @Then("the user click and to trolly and proceed to checkout")
    public void the_user_click_and_to_trolly_and_proceed_to_checkout() {
        complicatedSteps.clickAddToTrolly();
        complicatedSteps.clickProccedToCheckout();

    }
    @Then("the user delet the selected dress from cart")
    public void the_user_delet_the_selected_dress_from_cart() {
        complicatedSteps.clickDressOption();

    }


}
