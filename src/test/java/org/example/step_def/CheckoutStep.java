package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.CheckoutPage;

import java.util.List;
import java.util.Map;

public class CheckoutStep extends DriverManager {
    DriverManager driverManager = new DriverManager();
    CheckoutPage checkoutPage = new CheckoutPage();
    List<Map <String ,String> >  data;


    @Then("^I  should see  checkout text$")
    public void i_should_see_checkout_text() throws Throwable {

        checkoutPage.getCheckoutText();}


    @Given("^I enter following details on checkout page$")
    public void i_enter_following_details_on_checkout_page(DataTable dataTable) throws Throwable {

        data =  dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        checkoutPage.selectCountrySelection(data.get(0).get("country"));
        checkoutPage.addCity(data.get(0).get("city"));
        checkoutPage.addAddress(data.get(0).get("addressLine1 "));
        checkoutPage.addPostalCode(data.get(0).get("postcode"));
        checkoutPage.addPhoneNo(data.get(0).get("phoneNumber"));
    }

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

        checkoutPage.clickOnRadioBtn();}




        @Given("^I click on morecontinue button$")
        public void i_click_on_morecontinue_button() throws Throwable {

        checkoutPage.clickOnMoreContinue();
    }

    @Given("^I enter following details on the payment page$")
    public void i_enter_following_details_on_the_payment_page(DataTable dataTable) throws Throwable {

        data=dataTable.asMaps(String.class ,String.class);
        System.out.println(data);
checkoutPage.addCardType();
checkoutPage.addCardHolder(data.get(0).get("cardName"));
checkoutPage.addCardNo(data.get(0).get("cardNumber"));
checkoutPage.addCardCode(data.get(0).get("cardCode"));}

        @Given("^I click on lastcountinue  button$")
        public void i_click_on_lastcountinue_button() throws Throwable {

         checkoutPage.clickOnLastContinue();


    }
}
