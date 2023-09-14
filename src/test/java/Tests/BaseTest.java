package Tests;

import Utilities.MobileDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utilities.DriverManager;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver _driver = null;

    @BeforeMethod
    @Parameters({"platform"})
    public void setUp(String platform) {
        if ("desktop".equalsIgnoreCase(platform)) {
            _driver = DriverManager.getDriver();
            _driver.get("https://www.eurekaforbes.com/");


        } else if ("mobile".equalsIgnoreCase(platform)) {
            _driver = MobileDriverManager.getDriver();
            _driver.get("https://www.eurekaforbes.com/");
            ;
        }


        _driver.manage().window().maximize();
    }

    @AfterMethod
    @Parameters({"platform"})
    public void tearDown(String platform) throws InterruptedException {
        Thread.sleep(1000);
        _driver.quit();
        if ("desktop".equalsIgnoreCase(platform)) {
            if (DriverManager.getDriver() != null) {
                DriverManager.closeDriver();
            }
        } else {

            if (MobileDriverManager.getDriver() != null) {
                MobileDriverManager.closeDriver();
            }
        }
    }
}

