package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    // WebElements using PageFactory
    @FindBy(id = "mobNumber")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//button[@name='mob_submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//h1[contains(text(),'Eureka Forbes Customer Login')]")
    private WebElement loginHeaderText;

    @FindBy(id = "otp")
    private WebElement otpField;

    @FindBy(name = "otp_submit")
    private WebElement otpContinueButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getLoginHeaderText() {
        return loginHeaderText.getText();
    }
    public void waitForOTPField() throws InterruptedException {
       Thread.sleep(5000);

    }
    public void enterMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void clickContinueButton() {
        continueButton.click();
    }



    public void enterOTP(String otp) {
        otpField.sendKeys(otp);
    }

    public void clickOTPContinueButton() {
        otpContinueButton.click();
    }
}
