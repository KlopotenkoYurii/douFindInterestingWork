import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestRunner {
        protected WebDriver driver = null;

    @BeforeSuite
        public void BeforeSuite(){
        System.out.println("start Before Suite");
        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.gecko.driver","C:\\douFindInterestingWork\\Geckodriver\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeMethod
        public void BeforeMetod(){
        System.out.println("start Before Method");
        driver = new ChromeDriver();
        // driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }

    @AfterMethod
        public void AfterMethod() {
            System.out.println("start After Method");
    }
        public void closeNotUsedTabs() {
            String currentTab = driver.getWindowHandle();
            List<String> allTabs = new ArrayList<String>(driver.getWindowHandles());

            for (int i = 0; i < allTabs.size(); i++) {
                String tab = allTabs.get(0);
                if (!tab.equals(currentTab)) {
                    driver.switchTo().window(tab);
                    driver.close();
                }
            }
            driver.switchTo().window(currentTab);
        }


    @AfterSuite
        public void AfterSuite(){
        System.out.println("start After Suite");
    }


}
