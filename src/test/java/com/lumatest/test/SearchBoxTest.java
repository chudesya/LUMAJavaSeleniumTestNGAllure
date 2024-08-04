package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.data.TestData;
import io.qameta.allure.Allure;
import com.lumatest.model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;


public class SearchBoxTest extends BaseTest {

  @Test
    (testName = "HOME PAGE | Search Box Presence",
      description = "TC-SEARCH-001 Ensure that the search bar is present on the homepage",
      groups = {"smoke", "regression"}
    )
  @Story("Search")
  @Severity(SeverityLevel.NORMAL)
  @Description("To verify that the search box is  displays.")
  @Link(TestData.BASE_URL)
  public void presenceOfSearchBox() {
    Allure.step("Open Base URL.");
    getDriver().get(TestData.BASE_URL);

    boolean presenceOfTheSearchBox = new HomePage(getDriver())
      .presenceOfTheSearchBox();

    Allure.step("Verify the search box is present on the page.");
    Assert.assertTrue(presenceOfTheSearchBox);
  }
}
