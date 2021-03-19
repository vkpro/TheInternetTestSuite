package pages.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginBtn = By.cssSelector("#login > button");
    private final By notification = By.cssSelector("#flash");
    private final By usernameField = By.cssSelector("#username");
    private final By passwordField = By.cssSelector("#password");

    public LoginPage clickOnLoginBtn() {
        driver.findElement(loginBtn).click();
        return this;
    }

    /**
     * Check the content of the notification message
     *
     * @param expectedMessage the notification message expected on the web page
     */
    public LoginPage checkNotificationMessage(String expectedMessage) {
        WebElement notificationElement = driver.findElement(notification);
        String actualNotificationMessage = waitElementIsVisible(notificationElement)
                .getAttribute("textContent").trim();
        Assertions.assertTrue(actualNotificationMessage.contains(expectedMessage));
        return this;
    }

    /**
     * Fill the auth form with the username and password
     *
     * @param username username for the authentication on the web page
     * @param password password for the authentication on the web page
     */
    public LoginPage fillAuthForm(String username, String password) {
        WebElement usernameInput = driver.findElement(usernameField);
        WebElement passwordInput = driver.findElement(passwordField);
        waitElementIsVisible(usernameInput).sendKeys(username);
        waitElementIsVisible(passwordInput).sendKeys(password);
        return this;

    }

}
