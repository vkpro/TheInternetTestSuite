package constants;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls{
        public static final String WEBSITE_URL = "http://the-internet.herokuapp.com";
        public static final String LOGIN_PAGE_URL = WEBSITE_URL + "/login";
        public static final String ADD_REMOVE_PAGE_URL = WEBSITE_URL + "/add_remove_elements/";
    }

    public static class LoginTestData {
        public static final String USERNAME = "tomsmith";
        public static final String PASSWORD = "SuperSecretPassword!";
    }
}
