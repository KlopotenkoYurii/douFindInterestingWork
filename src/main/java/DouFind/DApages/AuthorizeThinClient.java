package DouFind.DApages;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.WebDriver;

import static DouFind.Url.Urls.LINKEDIN_PAGE;

public class AuthorizeThinClient extends ClassFeatures {

    public static final String DAAUTORIZE = "https://imageacquisition-demo.cloud.artsyltech.com/";

    public AuthorizeThinClient(WebDriver driver) {super(driver);}

    public AuthorizeThinClient open_AuthorizeThinClientPage(){
        driver.get(DAAUTORIZE);
        Wait.waitFor(1);
        return this;
    }


}