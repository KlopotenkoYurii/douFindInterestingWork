package DouFind;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ClassFeatures {
    public WebDriver driver;
    public WebDriverWait wait;

    public ClassFeatures(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 2);
    }

    public ClassFeatures() {}

    public ClassFeatures open(String url) {
        driver.get(url);
        return this;
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void switchToLastTab() {
        List<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(list.size() - 1));
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void click(String locator) {
        driver.findElement(find(locator)).click();
    }

    public void input(String locator, String value) {
        driver.findElement(find(locator)).sendKeys(value);
    }


    protected By find(String locator) {
        if (locator.startsWith("//") || locator.startsWith("./")) {
            return By.xpath(locator);
        }

        return By.cssSelector(locator);
    }

}
