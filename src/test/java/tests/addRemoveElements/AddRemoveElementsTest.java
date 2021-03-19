package tests.addRemoveElements;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.ADD_REMOVE_PAGE_URL;

public class AddRemoveElementsTest extends BaseTest {
    @Test
    public void checkAddElement() {
        basePage.goToUrl(ADD_REMOVE_PAGE_URL);
        addRemoveElementPage
                .clickOnAddElementBtn()
                .checkElementAdded();
    }

    @Test
    public void checkRemoveElement() {
        basePage.goToUrl(ADD_REMOVE_PAGE_URL);
        addRemoveElementPage
                .clickOnAddElementBtn()
                .checkElementAdded()
                .removeElement();
    }
}


