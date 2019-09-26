package DouFind.DocAlpha.TestCases;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class VerificationStationTC1 extends ClassFeatures {
    public VerificationStationTC1(WebDriver driver) {super(driver);}

    public VerificationStationTC1 openVerificationStation(){
        Wait.waitFor(4);
        click("//div[3]/div[2]/div[3]");
        Wait.waitFor(5);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }


    public VerificationStationTC1 openBatch(){
        Wait.waitFor(8);
        click("//tbody[@id='dataTable']/tr/td[2]");
        return this;
    }

    //...............Header fields of profile
    public VerificationStationTC1 VendorID(){
        Wait.waitFor(8);
        WebElement vendID = driver.findElement(By.name("Vendor_ID"));
        vendID.sendKeys("AAVENDOR");
        return this;
    }
    public VerificationStationTC1 Date(){
        WebElement date = driver.findElement(By.name("Date"));
        date.sendKeys("9/25/2019");
        return this;
    }
    public VerificationStationTC1 Number(){
        WebElement number = driver.findElement(By.name("Number"));
        number.sendKeys("09112");
        return this;
    }

   // ................ add table
    public VerificationStationTC1 AddRow(){
        Wait.waitFor(2);
        click("//td[9]/div");
        return this;
    }

    // ................ enter mandatory fields of the table
    public VerificationStationTC1 InventoryID(){
        Wait.waitFor(2);
        WebElement inventory = driver.findElement(By.xpath("//table[@id='DatatableContainer']/tbody/tr/td[1]/div/div/textarea"));
        inventory.sendKeys("AALEGO500");
        return this;
    }
    public VerificationStationTC1 Quantity(){
        WebElement qti = driver.findElement(By.xpath("//td[3]/div/div/textarea"));
        qti.sendKeys("2");
        return this;
    }
    public VerificationStationTC1 UOM(){
        WebElement uom = driver.findElement(By.xpath("//td[4]/div/div/textarea"));
        uom.sendKeys("EA");
        return this;
    }
    public VerificationStationTC1 Branch(){
        WebElement branch = driver.findElement(By.xpath("//td[7]/div/div/textarea"));
        branch.sendKeys("PRODWHOLE");
        return this;
    }

    //................... validation, save blocks and send batch to export
    public VerificationStationTC1 RuleConfirm(){
        Wait.waitFor(3);
        WebElement ruleConfirm = driver.findElement(By.xpath("//div[@id='RuleTable']/div[2]/div[4]"));
        ruleConfirm.click();
        return this;
    }
    public VerificationStationTC1 SaveBlocks(){
        Wait.waitFor(3);
        click("//div[@id='BlockControl']/div/div[4]");
        return this;
    }
    public VerificationStationTC1 ClickSummit(){
        Wait.waitFor(6);
        WebElement Submit = driver.findElement(By.id("Submit"));
        Submit.click();
        return this;
    }
}
