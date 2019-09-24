package DouFind.PagesOfLinkedin;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static DouFind.Locators.Locators.*;
import static DouFind.Url.Urls.LINKEDIN_PAGE;

public class Authorization_page extends ClassFeatures {
    public Authorization_page(WebDriver driver) {super(driver);
    }


    public Authorization_page openAuthorizationPage() {
        driver.get(LINKEDIN_PAGE);
        Wait.waitFor(1);
        return this;
    }
    public Authorization_page goToSignIn(){
        driver.findElement(By.xpath(GET_SIGNIN)).click();
        return this;
    }
    public Authorization_page inputLogin(){
        driver.findElement(By.xpath(USER_NAME)).sendKeys("klopotenko1988@gmail.com");
        return this;
    }
    public Authorization_page inputPassword () {
        driver.findElement(By.xpath(PASSWORD)).sendKeys("80976517490");
        Wait.waitFor(2);
        return this;
    }

    public Authorization_page submitPress(){
        driver.findElement(By.xpath(SUBMIT)).click();
        Wait.waitFor(2);
        return this;
    }
    public Authorization_page goToFriendsTab(){
        driver.getCurrentUrl();
        driver.findElement(By.xpath(FRIEND)).click();
        Wait.waitFor(1);
        return this;
    }

}
