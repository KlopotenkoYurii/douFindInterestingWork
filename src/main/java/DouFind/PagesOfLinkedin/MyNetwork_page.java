package DouFind.PagesOfLinkedin;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static DouFind.Locators.Locators.*;

public class MyNetwork_page extends ClassFeatures {

    public MyNetwork_page(WebDriver driver) {
        super(driver);
    }

   public MyNetwork_page scrollDown() {
       Wait.waitFor(2);
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       Wait.waitFor(2);
       return this;
   }

    public void addContact() {
        Wait.waitFor(4);
        for (int i=0; i<15; i++){
            if(i<15){
                driver.findElement(By.xpath(ADD_CONTACT)).click();
                Wait.waitFor(1);
            }
            else break;
        }
}
}
