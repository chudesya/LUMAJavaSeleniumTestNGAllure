package com.lumatest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TopMenu {
    @FindBy(id = "search")
    private WebElement searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage typeTextToSearchBox(String text) {
        searchBox.sendKeys(text + Keys.ENTER);

        return new SearchResultPage(getDriver());
    }

    @Step("Check search box presence on the page.")
    public boolean presenceOfTheSearchBox() {

        return searchBox.isDisplayed();
    }
}
