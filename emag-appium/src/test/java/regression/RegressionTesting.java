package regression;

import chrome.test.AbstractTest;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTesting extends AbstractTest {
    @Test
    public void openMyAccountPage() throws InterruptedException {
        homePage.goToMyAccount();
        Thread.sleep(3000);
    }

    @Test
    public void goToAutenthification() throws InterruptedException {
        homePage.goToMyAccount().autenthificationButton();
        Thread.sleep(1500);
    }

    @Test
    public void inputEmailInTextbox() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .inputLoginEmail();
        Thread.sleep(5000);
    }

    @Test
    public void inputPasswordInTextbox() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .inputLoginPassword();
        Thread.sleep(5000);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .inputLoginEmail()
                .inputLoginPassword()
                .loginButton();
    }

    @Test
    public void registerButtonTesting() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .registerButton();
    }

    @Test
    public void registerEmailTextBox() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .registerButton()
                .inputEmailForRegister();
    }

    @Test
    public void registerPasswordTextBox() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .registerButton()
                .inputPasswordForRegister();
    }

    @Test
    public void registerNameTextBox() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .registerButton()
                .inputNameForRegister();
    }

    @Test
    public void createANewAccount() throws InterruptedException {
        homePage.goToMyAccount()
                .autenthificationButton()
                .clickOnYesButtonForAge()
                .registerButton()
                .clickOnEmailTextBoxForRegister()
                .inputEmailForRegister()
                .inputPasswordForRegister()
                .inputNameForRegister()
                .clickNextButtonRegister();
    }

    @Test
    public void openProductsCategory() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton();
    }

    @Test
    public void openTelefoaneTableteCategory() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory();
    }

    @Test
    public void openTelefoaneSiAccesorii() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton();
    }

    @Test
    public void openCastiCategory() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory();


    }

    @Test
    public void openCastiProduct() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct();


    }

    @Test
    public void disableLocation() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation();


    }

    @Test
    public void reviewButton() throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation()
                .clickOnReviewButton();


    }

    @Test
    public void openAllReviews () throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation()
                .clickOnReviewButton()
                .clickOnAllReviewsButtons();


    }

    @Test
    public void numberOfRatings () throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation()
                .clickOnReviewButton()
                .clickOnAllReviewsButtons()
                .takeReviewStars();


    }

    @Test
    public void oneStarReview () throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation()
                .clickOnReviewButton()
                .clickOnAllReviewsButtons()
                .takeReviewStars()
                .expectedOneStar();


    }

    @Test
    public void finalResult () throws InterruptedException {
        homePage.goToMyAccount()
                .clickOnProductsButton()
                .clickOnYesButtonForAge()
                .clickOnTelefoaneTableteCategory()
                .clickOnTelefoaneSiAccesoriiButton()
                .clickOnCastiCategory()
                .clickOnCastiProduct()
                .clickOnLaterButtonForLocation()
                .clickOnReviewButton()
                .clickOnAllReviewsButtons()
                .takeReviewStars();

    }








}

