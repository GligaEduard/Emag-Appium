package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsCategory extends AbstractPage {

    @AndroidFindBy(id = "ro.emag.android:id/ivSupracategoryHome")
    private AndroidElement categoryTableteTelefoane;

    @AndroidFindBy(id = "ro.emag.android:id/btn_dialog_over_16")
    private AndroidElement moreThan16YearsButton;

    ProductsCategory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }

    public PhoneAndTabletsCategory clickOnTelefoaneTableteCategory() throws InterruptedException {
        categoryTableteTelefoane.click();
        Thread.sleep(1000);
        return new PhoneAndTabletsCategory(appiumDriver);
    }

    public ProductsCategory clickOnYesButtonForAge() {
        moreThan16YearsButton.click();
        return this;
    }


}
