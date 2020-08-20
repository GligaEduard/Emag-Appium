package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class HomePhoneCategory extends AbstractPage {
    @AndroidFindBy(id = "ro.emag.android:id/tv_listing_regular_product_name")
    private List<AndroidElement> castiProduct;

    HomePhoneCategory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }


    public Product clickOnCastiProduct() throws InterruptedException {
        castiProduct.get(0).click();
        Thread.sleep(3000);
        return new Product(appiumDriver);
    }
}
