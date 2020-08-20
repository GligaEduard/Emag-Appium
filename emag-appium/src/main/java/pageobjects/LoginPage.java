package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends AbstractPage {
    @AndroidFindBy(id = "ro.emag.android:id/et_email")
    private AndroidElement emailTextBoxForLogin;

    @AndroidFindBy(id = "ro.emag.android:id/et_password")
    private AndroidElement passwordTextBoxForLogin;

    @AndroidFindBy(id = "ro.emag.android:id/btn_authenticate")
    private AndroidElement nextLoginButton;

    @AndroidFindBy(id = "ro.emag.android:id/btn_dialog_over_16")
    private AndroidElement moreThan16YearsButton;

    @AndroidFindBy(id = "ro.emag.android:id/btn_new_user")
    private AndroidElement createANewAccount;

    @AndroidFindBy(className = "android.widget.TextView")
            private AndroidElement loginPageVisibility;


    LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
        waitForVisibility(loginPageVisibility);
    }

    public LoginPage inputLoginEmail() {
        emailTextBoxForLogin.sendKeys("test-peti1234@yahoo.com");
        return this;
    }

    public LoginPage inputLoginPassword() {
        passwordTextBoxForLogin.sendKeys("Parola111");
        return this;
    }

    public LoginPage loginButton() throws InterruptedException {
        nextLoginButton.click();
        Thread.sleep(5000);
        return this;
    }

    public LoginPage clickOnYesButtonForAge() {
        moreThan16YearsButton.click();
        return this;
    }

    public RegisterPage registerButton() {
        createANewAccount.click();
        return new RegisterPage(appiumDriver);
    }


}

