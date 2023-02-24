package com.amazon.Steps;

import com.amazon.pages.SearchProduct;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchproductSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on All menu$")
    public void iClickOnAllMenu() throws InterruptedException {
        new SearchProduct().ClickonAlltab();
    }

    @And("^I click on Electronics,computer & office$")
    public void iClickOnElectronicsComputerOffice() {
        new SearchProduct().ClickonElectronicsMenu();
    }

    @And("^I click on All Electronics$")
    public void iClickOnAllElectronics() {
        new SearchProduct().ClickonAllElectronics();
    }
    @And("^I search Product \"([^\"]*)\"$")
    public void iSearchProduct(String product) {

        new SearchProduct().EnterProduct(product);

    }

    @Then("^I see product list$")
    public void iSeeProductList() {
        new SearchProduct().ClickonSearchbutton();
    }



}
