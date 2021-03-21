package common;

import com.codeborne.selenide.Configuration;

public class Config {
    /**
     * Specify the browser and platform for test
     * firefox opera edge ie chrome
     */
    public static String BROWSER_NAME = "chrome";
    /**
     * Clean browser cookies after iteration
     **/
    public static final Boolean CLEAR_COOKIES = true;
    /**
     * Keep the browser open after al tests
     **/
    public static final Boolean HOLD_BROWSER_OPEN = false;

    /**
     * Clear the dir with the screenshots before the build starting
     **/
    public static final Boolean CLEAR_REPORTS_DIR = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER_NAME;
    }
}
