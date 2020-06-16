package sample;

import org.junit.Test;

public class AutomationTest extends WebDriverSystemProperties {

    @Test
    public void WrongResearch() {
        HomePage homePage = new HomePage(webDriver);
        homePage.searchAndClick("aaaa");
        homePage.getMessageError("No results were found for your search \"aaaa\"");
    }

    @Test
    public void RightSearch() {
        HomePage homePage = new HomePage(webDriver);
        homePage.searchAndClick("Blouse");
        homePage.getMessageCorrect("Blouse");
    }

    @Test
    public void ViewShoppingCart() {
        HomePage homePage = new HomePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        homePage.clickCart();
        cartPage.getTitleCart("SHOPPING-CART SUMMARY");
    }
}
