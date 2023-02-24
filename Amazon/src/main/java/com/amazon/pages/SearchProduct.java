package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends Utility {
    private static final Logger log = LogManager.getLogger(SearchProduct.class.getName());

    public SearchProduct(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li[19]")
    WebElement ElectroniceAndComputertab;

    @FindBy(xpath = "//div[@id='nav-main']/div/a")
    WebElement AllTab;

    @FindBy(id="twotabsearchtextbox")
    WebElement SearchBar;

    @FindBy(id="nav-search-submit-button")
    WebElement SearchButton;

    @FindBy(xpath = "//ul[@data-menu-id='12']/li[3]")
    WebElement AllElectronics;
    public void ClickonAlltab() throws InterruptedException {
        clickOnElement(AllTab);
        ScrollBy();

    }

    public void ClickonElectronicsMenu(){
        clickOnElement(ElectroniceAndComputertab);
    }
    public void EnterProduct(String txt){
        sendTextToElement(SearchBar,txt);
    }

    public void ClickonSearchbutton(){
        clickOnElement(SearchButton);
    }

    public void ClickonAllElectronics(){
        clickOnElement(AllElectronics);
    }
}
