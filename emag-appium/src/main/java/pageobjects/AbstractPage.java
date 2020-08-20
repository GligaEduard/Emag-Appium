package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class AbstractPage {
   protected AppiumDriver appiumDriver;
   AbstractPage(AppiumDriver appiumDriver){
       this.appiumDriver = appiumDriver;
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
       ensurePageDisplayed();
   }
    private static final double SWIPE_RATIO_TWO_THIRDS = 0.85;
    private static final double SWIPE_RATIO_ONE_THIRD = 0.15;

   private AppiumDriver getAppiumDriver(){
       return this.appiumDriver;
   }

   private FluentWait<AppiumDriver> fluentWait(){
       return new FluentWait<>(appiumDriver).withTimeout(Duration.ofSeconds(15)).ignoring(NoSuchElementException.class);
   }

   public abstract void ensurePageDisplayed();

   protected AndroidElement waitForVisibility(final AndroidElement androidElement){
       fluentWait().until(visibilityOf(androidElement));
       return androidElement;
   }
    private void swipeX(final double xStartRatio, final double xEndRatio) {
        final Dimension size = appiumDriver.manage().window().getSize();
        final int height = size.getHeight();
        final int width = size.getWidth();

        final int xStart = (int) Math.floor(width * xStartRatio);
        final int xEnd = (int) Math.floor(width * xEndRatio);
        final int y = height / 2;

        TouchAction touchAction = new TouchAction(appiumDriver);
        PointOption pointOption = new PointOption();

        touchAction.press(pointOption.withCoordinates(xStart, y)).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))).moveTo(pointOption.withCoordinates(xEnd, y)).release().perform();
    }

    private void swipeY(final double yStartRatio, final double yEndRatio) {
        final Dimension size = appiumDriver.manage().window().getSize();
        final int height = size.getHeight();
        final int width = size.getWidth();

        final int x = width / 2;
        final int yStart = (int) Math.floor(height * yStartRatio);
        final int yEnd = (int) Math.floor(height * yEndRatio);

        TouchAction touchAction = new TouchAction(appiumDriver);
        PointOption pointOption = new PointOption();

        touchAction.press(pointOption.withCoordinates(x, yStart)).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))).moveTo(pointOption.withCoordinates(x, yEnd)).release().perform();
    }

    protected void swipeLeft() {
        swipeX(SWIPE_RATIO_TWO_THIRDS, SWIPE_RATIO_ONE_THIRD);
    }

    protected void swipeRight() {
        swipeX(SWIPE_RATIO_ONE_THIRD, SWIPE_RATIO_TWO_THIRDS);
    }

    protected void swipeDown() {
        swipeY(SWIPE_RATIO_TWO_THIRDS, SWIPE_RATIO_ONE_THIRD);
    }

    protected void swipeUp() {
        swipeY(SWIPE_RATIO_ONE_THIRD, SWIPE_RATIO_TWO_THIRDS);
    }




}