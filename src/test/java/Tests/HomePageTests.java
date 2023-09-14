package Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import Utilities.DriverManager;
import pages.LoginPage;

public class HomePageTests extends BaseTest {
    @Test
    @Parameters({"platform"})
    public void verifyTestsFlow(String platform) throws InterruptedException {
        HomePage homePage = new HomePage(_driver);


        Assert.assertEquals(homePage.getTitle(), "Buy Water Purifiers, Vacuum Cleaners, Air Purifiers Online | Eureka Forbes");
        homePage.clickUserIcon();

        // Assert the URL after redirection
        String expectedURL = "https://www.eurekaforbes.com/customer/account/login";
        String actualURL = DriverManager.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Redirection to the login page failed!");

        // Assert the login page header text
        LoginPage loginPage = new LoginPage(_driver);
        String expectedHeaderText = "Eureka Forbes Customer Login";
        String actualHeaderText = loginPage.getLoginHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "Login page header text mismatch!");

        loginPage.enterMobileNumber("1234567890");
        loginPage.clickContinueButton();
        loginPage.waitForOTPField();
        loginPage.enterOTP("123456");  // Replace with a valid OTP
        loginPage.clickOTPContinueButton();






    }
}
