package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.CheckoutPage;

public class CheckoutStep extends DriverManager {
    DriverManager driverManager = new DriverManager();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("^I see should checkout text$")
    public void i_see_should_checkout_text() throws Throwable {
        checkoutPage.getCheckoutText();
    }

    @Given("^I enter following details on checkout page$")
    public void i_enter_following_details_on_checkout_page(DataTable arg1) throws Throwable {
        checkoutPage.clickOnCountrySelection();
        checkoutPage.clickOnAddAddress();
        checkoutPage.clickOnPostalCode();
        checkoutPage.clickOnPhoneNo();}
        @Given("^I click on continue button$")
        public void i_click_on_continue_button() throws Throwable {

        checkoutPage.clickOnContinueBtn();
    }
    @Given("^I click on againcontinue button$")
    public void i_click_on_againcontinue_button() throws Throwable {
        checkoutPage.clickOnAgainContinueBtn();
    }

    @Given("^I select credit card$")
    public void i_select_credit_card() throws Throwable {
checkoutPage.clickOnRadioBtn();}{
        checkoutPage.clickOnRadioBtn();
    }

        @Given("^I click on morecontinue button$")
        public void i_click_on_morecontinue_button() throws Throwable {

        checkoutPage.clickOnMoreContinue();
    }

    @Given("^I enter following details on the payment page$")
    public void i_enter_following_details_on_the_payment_page(DataTable arg1) throws Throwable {
checkoutPage.clickOnCardType();
checkoutPage.clickOnCardHolder();
checkoutPage.clickOnCardNo();
checkoutPage.clickOnCardCode();}

        @Given("^I click on lastcountinue  button$")
        public void i_click_on_lastcountinue_button() throws Throwable {

         checkoutPage.clickOnLastContinue();


    }
}
