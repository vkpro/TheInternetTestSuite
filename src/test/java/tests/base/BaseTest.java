package tests.base;

import common.CommonActions;
import common.Listener;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.addRemoveElements.AddRemoveElementPage;
import pages.base.BasePage;
import pages.login.LoginPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected LoginPage loginPage = new LoginPage();
    protected AddRemoveElementPage addRemoveElementPage = new AddRemoveElementPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        LOGGER.info("START TIME: " + LocalTime.now());
        LOGGER.info("Start clear reports dir: build/reports ...");
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()) {
            for (File item : Objects.requireNonNull(allureResults.listFiles())) {
                item.delete();
            }
        }

        if (CLEAR_REPORTS_DIR) {
            File allureScreenshots = new File("build/reports/tests");
            for (File item : Objects.requireNonNull(allureScreenshots.listFiles())) {
                item.delete();
            }
        }
    }
}
