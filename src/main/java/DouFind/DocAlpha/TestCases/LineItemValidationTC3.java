package DouFind.DocAlpha.TestCases;

import DouFind.ClassFeatures;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LineItemValidationTC3 extends ClassFeatures {
    public LineItemValidationTC3 (WebDriver driver) {super(driver);}
    private static final String VERIFICATION = "https://verification-demo.cloud.artsyltech.com";
    private static final String PASSWORD = "Artsyl0154dA";
    private static final String LOGIN = "Acumatica 2";

// Authorization on the Verification station
    public LineItemValidationTC3 openVerification(){
        open(VERIFICATION);
        return this;
    }
    public LineItemValidationTC3 enterLogin(){
        driver.findElement(By.xpath("//input[@id='login_Login']")).sendKeys(LOGIN);
        return this;
    }
    public LineItemValidationTC3 enterPassword(){
        driver.findElement(By.xpath("//input[@id='login_Password']")).sendKeys(PASSWORD);
        return this;
    }
    public LineItemValidationTC3 enterLogIn(){
        click("//button[@id='ForTestLoginProceedButton']");
        return this;
    }


}
