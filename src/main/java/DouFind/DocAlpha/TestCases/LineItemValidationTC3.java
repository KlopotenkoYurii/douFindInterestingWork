package DouFind.DocAlpha.TestCases;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LineItemValidationTC3 extends ClassFeatures {
    public LineItemValidationTC3 (WebDriver driver) {super(driver);}
    private static final String VERIFICATION = "https://verification-demo.cloud.artsyltech.com";
    private static final String PASSWORD = "Artsyl0154dA";
    private static final String LOGIN = "Acumatica 2";

    private static final String PONUMBER = "PO000943";
    private static final String VENDORID = "4564564564";
    private static final String INVENTORYID = "3K6344-44";

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

    public LineItemValidationTC3 changeProfile(){
        Wait.waitFor(9);
        click("//div[@id='BlockTableResizeWidget']/div/div[2]/select/option[2]");
        return this;
    }

    public LineItemValidationTC3 addRow(){
        Wait.waitFor(2);
        driver.findElement(By.xpath("//td[14]/div")).click();
        return this;
    }
    public LineItemValidationTC3 poNumber(){
        Wait.waitFor(4);
        driver.findElement(By.xpath("//div/div/textarea")).sendKeys(PONUMBER);
        return this;
    }
    public LineItemValidationTC3 inventoryNumber(){
        driver.findElement(By.xpath("//td[2]/div/div/textarea")).sendKeys(INVENTORYID);
        return this;
    }

    public LineItemValidationTC3 vendorID(){
        driver.findElement(By.xpath("//td[12]/div/div/textarea")).sendKeys(VENDORID);
        return this;
    }

    public LineItemValidationTC3 clickSavesBlocks(){
        Wait.waitFor(2);
        click("//section/div[2]/div/div[5]");
        return this;
    }
    public LineItemValidationTC3 clickOnRequest(){
        Wait.waitFor(14);
        click("//div[2]/div[8]");
        return this;
    }


}
