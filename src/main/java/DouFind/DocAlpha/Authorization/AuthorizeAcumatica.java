package DouFind.DocAlpha.Authorization;

import DouFind.ClassFeatures;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizeAcumatica extends ClassFeatures {
    public AuthorizeAcumatica(WebDriver driver) {super(driver);}

    public static final String ACUMATICA = "http://13.68.229.141/AcumaticaERP/Frames/Login.aspx?ReturnUrl=%2fAcumaticaERP";
    public static final String LOGIN = "//div[@id='login_user']/input[4]";
    public static final String PASSWORD = "//div[@id='login_user']/input[8]";

    public AuthorizeAcumatica openAcumatica() {
        open(ACUMATICA);
        return this;
    }
    public AuthorizeAcumatica authorizeLogin(){
        driver.findElement(By.xpath(LOGIN)).sendKeys("admin");
                return this;
    }
    public AuthorizeAcumatica authorizePassword(){
        driver.findElement(By.xpath(PASSWORD)).sendKeys("Artsyl0154dA");
        return this;
    }
    public AuthorizeAcumatica clickSignIn(){
        click("//div[@id='login_user']/input[11]");
        return this;
    }
}
