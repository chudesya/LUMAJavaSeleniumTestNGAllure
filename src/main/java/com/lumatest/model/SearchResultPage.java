package com.lumatest.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends HomePage{

  @FindBy(partialLinkText = "\n" +
    "Your search returned no results.")
  private WebElement noMatchResult;

  @FindBy(xpath = "//h1[@class='page-title']")
  private WebElement matchLogResult;

  @FindBy(partialLinkText = "\n" +
    "Minimum Search query length is 3 ")
  private WebElement minimumSearchQueryLength;

  protected SearchResultPage(WebDriver driver) {
    super(driver);
  }



  public String getNoMatchText() {
    return noMatchResult.getText();
  }

  public String getMatchLogResult() {
    return matchLogResult.getText();
  }

  public String getMinimumSearchQueryText() {
    return minimumSearchQueryLength.getText();
  }

}
