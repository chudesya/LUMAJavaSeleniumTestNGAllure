package com.lumatest.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://magento.softwaretestingboard.com";
    public static final String BASE_URL_TITLE = "Home Page";

    //NavBar Menu
    public static final By WATS_NEW_MENU = By.xpath("//nav//span[text()=\"What's New\"]");
    public static final String WATS_NEW_URL = BASE_URL + "/what-is-new.html";
    public static final String WATS_NEW_TITLE = "What's New";

    public static final By SALE_MENU = By.xpath("//nav//span[text()='Sale']");
    public static final String SALE_URL = BASE_URL + "/sale.html";
    public static final String SALE_TITLE = "Sale";

    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][]{
                {BASE_URL, WATS_NEW_MENU, WATS_NEW_URL, WATS_NEW_TITLE},
                {BASE_URL, SALE_MENU, SALE_URL, SALE_TITLE}
        };
    }

}
