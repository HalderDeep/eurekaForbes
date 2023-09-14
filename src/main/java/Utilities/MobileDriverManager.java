
package Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

    public class MobileDriverManager {
        private static AppiumDriver<MobileElement> driver;

        public static AppiumDriver<MobileElement> getDriver() {
            if (driver == null) {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); // or "iOS"
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Your_Device_Name");
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); // or "Safari" for iOS

                try {
                    driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            return driver;
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }


