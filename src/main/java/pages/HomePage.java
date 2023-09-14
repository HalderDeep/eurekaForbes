package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    // WebElements using PageFactory

    @FindBy(xpath = "//img[@alt='EUREKA FORBES']")
    private WebElement eurekaForbesLogo;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement productDropdown;

    @FindBy(xpath = "//a[contains(text(),'Service')]")
    private WebElement serviceMenu;

    @FindBy(className = "search-customs icon icon-search")
    private WebElement searchMenu;

    @FindBy(xpath = "//a[@class='icon icon-user myaccount']")
    private WebElement userIcon;


    @FindBy(xpath = "//a[contains(text(),'Book Demo')]")
    private WebElement bookDemoButton;

    @FindBy(xpath = "//a[contains(text(),'Buy AMC')]")
    private WebElement buyAMCButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Sample method
    public String getTitle() {
        return driver.getTitle();
    }
    public void clickEurekaForbesLogo() {
        eurekaForbesLogo.click();
    }

    public void clickProductDropdown() {
        productDropdown.click();
    }

    public void clickServiceMenu() {
        serviceMenu.click();
    }

    public void clickSearchMenu() {
        searchMenu.click();
    }

    public void clickUserIcon() {
        userIcon.click();
    }

    public void clickBookDemoButton() {
        bookDemoButton.click();
    }

    public void clickBuyAMCButton() {
        buyAMCButton.click();
    }




}
