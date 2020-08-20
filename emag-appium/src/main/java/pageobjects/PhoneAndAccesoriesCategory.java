package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class PhoneAndAccesoriesCategory extends AbstractPage {
    @AndroidFindBy(className = "android.widget.ImageView")
    private List<AndroidElement> categoriesTelefoaneSiAccesorii;

    PhoneAndAccesoriesCategory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }

    public HomePhoneCategory clickOnCastiCategory() throws InterruptedException {
//       appiumDriver.manage().window().getSize().getHeight();
//       appiumDriver.manage().window().getSize().getWidth();
//
//       System.out.println();
        TouchAction ts = new TouchAction(appiumDriver);
        swipeDown();
        Thread.sleep(1000);
        swipeDown();
        categoriesTelefoaneSiAccesorii.get(7).click();
        Thread.sleep(1000);
        return new HomePhoneCategory(appiumDriver);
    }
}
