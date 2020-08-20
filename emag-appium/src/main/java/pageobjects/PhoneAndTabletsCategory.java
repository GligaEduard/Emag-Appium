package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PhoneAndTabletsCategory extends AbstractPage {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement telefoaneSiAccesorii;


    PhoneAndTabletsCategory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }

    public PhoneAndAccesoriesCategory clickOnTelefoaneSiAccesoriiButton() throws InterruptedException {
        telefoaneSiAccesorii.click();
        Thread.sleep(1000);
        return new PhoneAndAccesoriesCategory(appiumDriver);
    }


}
