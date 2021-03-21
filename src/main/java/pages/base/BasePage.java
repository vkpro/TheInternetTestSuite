package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;


public class BasePage {

    /**
     * The method for navigating to a specific url
     */
    public void goToUrl(String url) {
        open(url);
    }

    /**
     * Clean the element of the text and enter the text
     *
     * @param element SelenideElement
     * @param value   some text
     */
    protected void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    public void checkMessage(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }
}


