package common;

public class Config {
    /**
     * Specify the browser and platform for test
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
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
    public static final Boolean CLEAR_REPORTS_DIR = false;

}
