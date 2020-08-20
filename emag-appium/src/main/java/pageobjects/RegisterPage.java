package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterPage extends AbstractPage {

    @AndroidFindBy(id = "ro.emag.android:id/edt_email")
    private AndroidElement emailTextBoxForRegister;

    @AndroidFindBy(id = "ro.emag.android:id/edt_password")
    private AndroidElement passwordTextBoxForRegister;

    @AndroidFindBy(id = "ro.emag.android:id/edt_name")
    private AndroidElement nameTextBoxForRegister;

    @AndroidFindBy(id = "ro.emag.android:id/btn_register")
    private AndroidElement nextButtonForRegister;

    RegisterPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }

    public RegisterPage clickOnEmailTextBoxForRegister() throws InterruptedException {
        emailTextBoxForRegister.click();
        Thread.sleep(3000);
        return this;
    }

    public RegisterPage inputEmailForRegister() {
        emailTextBoxForRegister.sendKeys("test-peti1234@yahoo.com");
        return this;
    }

    public RegisterPage inputPasswordForRegister() {
        passwordTextBoxForRegister.sendKeys("Parola111");
        return this;
    }

    public RegisterPage inputNameForRegister() {
        nameTextBoxForRegister.sendKeys("Testul lui Peti");
        return this;
    }

    public RegisterPage clickNextButtonRegister() throws InterruptedException {
        nextButtonForRegister.click();
        Thread.sleep(3000);
        return this;
    }
}
