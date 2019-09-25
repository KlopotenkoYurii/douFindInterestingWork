package DouFind.DApages;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class VerificationStation extends ClassFeatures {
    public VerificationStation(WebDriver driver) {super(driver);}

    public VerificationStation openVerificationStation(){
        Wait.waitFor(4);
        click("//div[3]/div[2]/div[3]");
        Wait.waitFor(5);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }


    public VerificationStation openBatch(){
        Wait.waitFor(8);
        click("//tbody[@id='dataTable']/tr/td[2]");
        return this;
    }
    public VerificationStation VendorID(){
        Wait.waitFor(8);
        WebElement vendID = driver.findElement(By.name("Vendor_ID"));
        vendID.sendKeys("AAVENDOR");
        vendID.click();
        return this;
    }
    public VerificationStation Date(){
        WebElement date = driver.findElement(By.name("Date"));
        date.sendKeys("9/25/2019");
        date.click();
        return this;
    }
    public VerificationStation Number(){
        WebElement number = driver.findElement(By.name("Number"));
        number.sendKeys("09112");
        number.click();
        return this;
    }
    public VerificationStation RuleConfirm(){
        Wait.waitFor(3);
        WebElement ruleConfirm = driver.findElement(By.xpath("//div[@id='RuleTable']/div[2]/div[4]"));
        ruleConfirm.click();
        return this;
    }
    public VerificationStation SaveBlocks(){
        Wait.waitFor(3);
        click("//div[@id='RuleTable']/div[2]/div[4]");
        return this;
    }
    public VerificationStation ClickSummit(){
        Wait.waitFor(3);
        click("/div[@id='Submit']");
        return this;
    }
}
