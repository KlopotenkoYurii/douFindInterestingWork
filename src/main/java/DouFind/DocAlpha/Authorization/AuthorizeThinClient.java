package DouFind.DocAlpha.Authorization;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizeThinClient extends ClassFeatures {

    public static final String DAAUTORIZE = "https://demo.cloud.artsyltech.com/";
    public static final String LOGIN = "//input[@id='login_Login']";
    public static final String PASSWORD = "//input[@id='login_Password']";


    public AuthorizeThinClient(WebDriver driver) {super(driver);}

    public AuthorizeThinClient open_AuthorizeThinClientPage(){
        open(DAAUTORIZE);
        Wait.waitFor(1);
        return this;
    }
    public AuthorizeThinClient inputLOGIN_AuthorizeThinClientPage(){
        driver.findElement(By.xpath(LOGIN)).sendKeys("Acumatica 2");
        return this;
    }
    public AuthorizeThinClient inputPASSWORD_AuthorizeThinClientPage(){
        driver.findElement(By.xpath(PASSWORD)).sendKeys("Artsyl0154dA");
        return this;
    }
    public AuthorizeThinClient clickPROCEED_AuthorizeThinClientPage(){
        click("//button[@id='ForTestLoginProceedButton']");
        return this;
    }

}