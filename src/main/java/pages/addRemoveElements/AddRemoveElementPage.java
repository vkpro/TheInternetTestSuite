package pages.addRemoveElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class AddRemoveElementPage extends BasePage {
    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    private final By AddBtn = By.cssSelector("#content > div > button");
    private final By DeleteBtn = By.cssSelector("#elements > button");


    public AddRemoveElementPage clickOnAddElementBtn() {
        driver.findElement(AddBtn).click();
        return this;
    }

    public AddRemoveElementPage checkElementAdded() {
        WebElement deleteBtn = driver.findElement(DeleteBtn);
        waitElementIsVisible(deleteBtn);
        return this;
    }

    public AddRemoveElementPage removeElement() {
        WebElement deleteBtn = driver.findElement(DeleteBtn);
        waitElementIsVisible(deleteBtn).click();
        return this;
    }


}
