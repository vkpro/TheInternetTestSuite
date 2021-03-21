package pages.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final SelenideElement loginBtn = $("#login > button");
    private final SelenideElement notification = $("#flash");
    private final SelenideElement usernameField = $("#username");
    private final SelenideElement passwordField = $("#password");

    public LoginPage clickOnLoginBtn() {
        loginBtn.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check the content of the notification message
     *
     * @param message the notification message expected on the web page
     */
    public LoginPage checkNotificationMessage(String message) {
//        String actualNotificationMessage = notification.shouldBe(Condition.visible)
//                .getAttribute("textContent").trim();
//        Assertions.assertTrue(actualNotificationMessage.contains(message));

        checkMessage(message);
        return this;
    }

    /**
     * Fill the auth form with the username and password
     *
     * @param username username for the authentication on the web page
     * @param password password for the authentication on the web page
     */
    public LoginPage fillAuthForm(String username, String password) {
        clearAndType(usernameField.shouldBe(Condition.visible), username);
        clearAndType(passwordField.shouldBe(Condition.visible), password);
        return this;

    }

}
