package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends AbstractPage {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Deschis\"]")
        private AndroidElement myAccountButton;

    @AndroidFindBy (id = "ro.emag.android:id/btn_dialog_over_16" )
    private AndroidElement moreThan16YearsButton;

    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
       // waitForVisibility(moreThan16YearsButton);
        waitForVisibility(myAccountButton);
    }

    public MyAccount goToMyAccount(){
        myAccountButton.click();
        return new MyAccount(appiumDriver);
    }

    public HomePage clickOnYesButtonForAge(){
        moreThan16YearsButton.click();
        return this;
    }

}
