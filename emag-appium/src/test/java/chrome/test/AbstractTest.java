package chrome.test;

import config.AppiumDriverBuilder;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;

import java.net.MalformedURLException;

public abstract class AbstractTest {

    public AppiumDriver driver;
    public HomePage homePage;



    @BeforeMethod(alwaysRun = true)
    public void connect() throws MalformedURLException {
        this.driver = AppiumDriverBuilder.forAppium().build();
        homePage = new HomePage(this.driver);
    }

    @AfterMethod(alwaysRun = true)
    public void kill() {
        driver.quit();
    }

}

