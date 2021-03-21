package tests.login.positive;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.LOGIN_PAGE_URL;
import static constants.Constant.LoginTestData.USERNAME;
import static constants.Constant.LoginTestData.PASSWORD;

public class SuccessfulLoginTest extends BaseTest {
    @Test
    public void checkAuthWithCorrectUsernamePassword() {
        basePage.goToUrl(LOGIN_PAGE_URL);
        loginPage
                .fillAuthForm(USERNAME, PASSWORD)
                .clickOnLoginBtn()
                .checkNotificationMessage("You logged into a secure area!");
    }

    @Test
    public void checkAuthWithIncorrectPassword() {
        basePage.goToUrl(LOGIN_PAGE_URL);
        loginPage
                .fillAuthForm(USERNAME, "WRONG_PASSWORD")
                .clickOnLoginBtn()
                .checkNotificationMessage("You logged into a secure area!");
    }
}
