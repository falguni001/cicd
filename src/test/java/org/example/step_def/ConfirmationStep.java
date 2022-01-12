package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ConfirmationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConfirmationStep extends DriverManager {
DriverManager driverManager = new DriverManager();
ConfirmationPage confirmationPage = new ConfirmationPage();

    @When("^I click on confirm button$")
    public void i_click_on_confirm_button() throws Throwable {
confirmationPage.clickOnConfirmationBtn();
    }

    @Then("^I should see \"([^\"]*)\" text on confirmation page$")
    public void i_should_see_text_on_confirmation_page(String arg1) throws Throwable {
        confirmationPage.getThankYouText();
        String thankYouText = confirmationPage.getThankYouText();
        System.out.println(thankYouText);
        assertThat(thankYouText, is(equalToIgnoringCase("Thank you")));

        confirmationPage.getConfirmationText();
        String confirmationText = confirmationPage.getConfirmationText();
        System.out.println(confirmationText);
        assertThat(thankYouText, is(equalToIgnoringCase("Your order has been successfully processed!")));

        String actualUrl = driverManager.getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl,is(endsWith("checkout/completed")));


    }



}

