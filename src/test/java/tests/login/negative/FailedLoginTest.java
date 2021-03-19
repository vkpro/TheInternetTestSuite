package tests.login.negative;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.LOGIN_PAGE_URL;
import static constants.Constant.LoginTestData.USERNAME;

public class FailedLoginTest extends BaseTest {
    @Test
    public void checkAuthWithEmptyUsername() {
        basePage.goToUrl(LOGIN_PAGE_URL);
        loginPage
                .clickOnLoginBtn()
                .checkNotificationMessage("Your username is invalid!");
    }

    @Test
    public void checkAuthWithWrongUsername() {
        basePage.goToUrl(LOGIN_PAGE_URL);
        loginPage
                .fillAuthForm("WrongUsername", "")
                .clickOnLoginBtn()
                .checkNotificationMessage("Your username is invalid!");
    }

    @Test
    public void checkAuthWithEmptyPassword() {
        basePage.goToUrl(LOGIN_PAGE_URL);
        loginPage
                .fillAuthForm(USERNAME, "")
                .clickOnLoginBtn()
                .checkNotificationMessage("Your password is invalid!");
    }
}
