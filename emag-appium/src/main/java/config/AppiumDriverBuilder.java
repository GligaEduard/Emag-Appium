package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AppiumDriverBuilder {

    public static AndroidDriverBuilder forAppium() {return new AndroidDriverBuilder();}

    public static class AndroidDriverBuilder extends AppiumDriverBuilder {
        AppiumDriver appiumDriver;
        public AppiumDriver build() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Pixel_3_API_29" );
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "10.0");
            capabilities.setCapability("skipUnlock", "true");
            capabilities.setCapability("app", System.getProperty("user.dir") + "\\emag.apk");
            System.out.println(System.getProperty("user.dir"));

            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);


            return appiumDriver;
        }
    }



}
