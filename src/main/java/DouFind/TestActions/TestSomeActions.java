package DouFind.TestActions;

import DouFind.ClassFeatures;
import DouFind.Settings.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class TestSomeActions extends ClassFeatures {
    public TestSomeActions (WebDriver driver) {super(driver);}

    public TestSomeActions op(){
        open("https://www.google.com");
        return this;
    }
    public TestSomeActions op2(){
        driver.findElement(By.name("q")).sendKeys("some interisting text");
        return this;
    }
    public TestSomeActions op3(){
        Wait.waitFor(2);
        driver.findElement(By.name("btnK")).click();
        return this;
    }
    public TestSomeActions op4(){
        Wait.waitFor(2);
        WebElement re = driver.findElement(By.name("q"));
        re.getAttribute("value");
        System.out.println("test what I enterred: " + re);
        return this;
    }
    public TestSomeActions op5() {
        Wait.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("return document.getElementById('q');");
        System.out.println("test what I enterred by JavaScript: " + js);
            return this;

    }
}
