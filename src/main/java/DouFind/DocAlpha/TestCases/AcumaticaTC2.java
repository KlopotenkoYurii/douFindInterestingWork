package DouFind.DocAlpha.TestCases;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcumaticaTC2 extends ClassFeatures {
    public AcumaticaTC2(WebDriver driver) {super(driver);}

    private static final String PAYABLES = "//span[contains(.,'Payables')]";
    private static final String BILLSANDADJUSTMENTS = "//span[contains(.,'Bills and Adjustments')]";
    private static final String BATCHID = "//table[2]/tbody/tr/td[6]/a";
    private static final String DATE = "//div[@id='ctl00_phF_form_t0_edDocDate']/div/div/input";
    private static final String VENDORREF = "//div[7]/div/div[2]/div[2]/input";

    public AcumaticaTC2 openPayables(){
        Wait.waitFor(5);
            click(PAYABLES);
        return this;
    }
    public AcumaticaTC2 openBillsAndAdjustments(){
        Wait.waitFor(2);
            click(BILLSANDADJUSTMENTS);
        return this;
    }
    public AcumaticaTC2 pushBatchid(){
        Wait.waitFor(4);
            driver.switchTo().frame(2);
                click(BATCHID);
        return this;
    }
    public AcumaticaTC2 getDataText(){
        Wait.waitFor(3);
        WebElement dataD = driver.findElement(By.xpath(DATE));
        dataD.getText();
        return this;
    }
    public AcumaticaTC2 getVendorRef(){
        Wait.waitFor(2);
        driver.findElement(By.xpath(VENDORREF)).getAttribute("textContent");
        return this;
    }

    public AcumaticaTC2 SysyOut(){
        System.out.println("Значение из блока: " + getDataText() + " Some value: " + getVendorRef());
        return this;
    }


}
