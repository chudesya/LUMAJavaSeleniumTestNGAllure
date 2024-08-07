package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.data.TestData;
import com.lumatest.model.HomePage;
import com.lumatest.model.ProductPage;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;

public class ProductPageTest extends BaseTest {

    @Test
      (testName = "PRODUCT | Product Details",
      description = "TC-03 Verify Product Details on Product Page",
      groups = {"regression"}
    )
    @Story("Product Details")
    @Severity(SeverityLevel.NORMAL)
    @Description("To verify that the product page displays the correct product name and breadcrumb menu text " +
      "for the 'Driven Backpack'.")
    @Link(TestData.DRIVEN_BACKPACK_PRODUCT_URL)
    public void testProduct() {
        Allure.step("Open Base URL.");
        getDriver().get(TestData.BASE_URL);

        ProductPage productPage = new HomePage(getDriver())
                .clickGearTopMenu()
                .clickBagsSideMenu()
                .clickProductImg(TestData.DRIVEN_BACKPACK_PRODUCT_NAME);

        final String productName = productPage.getProductNameText();
        final String breadcrumbsMenuText = productPage.getBreadcrumbsMenuText();

        Allure.step("Verify actual '" + productName + "' equals to '" + TestData.DRIVEN_BACKPACK_PRODUCT_NAME + "'");
        Assert.assertEquals(productName, TestData.DRIVEN_BACKPACK_PRODUCT_NAME);

        Allure.step("Verify actual '" + breadcrumbsMenuText + "' equals to '" + TestData.DRIVEN_BACKPACK_PRODUCT_PAGE_BREADCRUMBS_MENU_TEXT + "'");
        Assert.assertEquals(breadcrumbsMenuText, TestData.DRIVEN_BACKPACK_PRODUCT_PAGE_BREADCRUMBS_MENU_TEXT);
    }
}
