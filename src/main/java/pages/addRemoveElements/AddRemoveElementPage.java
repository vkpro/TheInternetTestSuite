package pages.addRemoveElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElementPage extends BasePage {

    private final SelenideElement AddBtn = $("#content > div > button");
    private final SelenideElement DeleteBtn = $("#elements > button");


    public AddRemoveElementPage clickOnAddElementBtn() {
        AddBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public AddRemoveElementPage checkElementAdded() {
        DeleteBtn.shouldBe(Condition.visible);
        return this;
    }

    public AddRemoveElementPage removeElement() {
        DeleteBtn.shouldBe(Condition.visible).click();
        return this;
    }
}
