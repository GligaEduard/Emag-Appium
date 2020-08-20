package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAccount extends AbstractPage {

    @AndroidFindBy(id = "ro.emag.android:id/login_button")
    private AndroidElement autenthification;


    @AndroidFindBy(id = "ro.emag.android:id/btn_dialog_over_16")
    private AndroidElement moreThan16YearsButton;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]")
    private AndroidElement productsButton;


    MyAccount(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {

    }


    public LoginPage autenthificationButton() throws InterruptedException {
        autenthification.click();
        return new LoginPage(appiumDriver);
    }


    public MyAccount clickOnYesButtonForAge() {
        moreThan16YearsButton.click();
        return this;
    }




    public ProductsCategory clickOnProductsButton() throws InterruptedException {
        productsButton.click();
        Thread.sleep(1000);
        return new ProductsCategory(appiumDriver);
    }


}







