package DouFind.Locators;

public class Locators {
        //Authorization_page
        public static final String GET_SIGNIN = "//a[contains(text(),'Sign in')]";
        public static final String USER_NAME = "//input[@id='username']";
        public static final String PASSWORD = "//input[@id='password']";
        public static final String SUBMIT = "//button[contains(.,'Sign in')]";
        public static final String FRIEND = "//li[@id='mynetwork-nav-item']/a/span";

        //MyNetwork_page
        public static final String ADD_CONTACT = "//footer/button/span";
        public static final String ADD_CONTACT2 = "//section/div[2]";
        public static final String ADD_CONTACT3 = "//li[2]/div/section/div[2]/footer/button/span";

}

