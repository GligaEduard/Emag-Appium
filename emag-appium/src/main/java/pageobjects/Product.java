package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ArrayList;
import java.util.List;

public class Product extends AbstractPage {

    @AndroidFindBy(id = "ro.emag.android:id/btnLater")
    private AndroidElement locationButton;

    @AndroidFindBy(className = "androidx.appcompat.app.ActionBar$Tab")
    private List<AndroidElement> reviewButton;

    @AndroidFindBy(id = "ro.emag.android:id/btnProductRatingAction")
    private AndroidElement allReviewsButton;

    @AndroidFindBy(id = "ro.emag.android:id/rbReviewsRatingBar")
    private List<AndroidElement> revieweRatingStars;

    public List<AndroidElement> getExpectedStars() {
        return expectedStars;
    }

    public void setExpectedStars(List<AndroidElement> expectedStars) {
        this.expectedStars = expectedStars;
    }

    @AndroidFindBy(id = "ro.emag.android:id/tvRatingPbCount")
    private List<AndroidElement> expectedStars;
    @AndroidFindBy(id = "ro.emag.android:id/tvReviewUserName")
    private List<AndroidElement> reviewUsername;

    Product(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Override
    public void ensurePageDisplayed() {
    }

    public Product clickOnLaterButtonForLocation() throws InterruptedException {
        locationButton.click();
        Thread.sleep(1000);
        return this;
    }

    public Product clickOnReviewButton() throws InterruptedException {
        reviewButton.get(4).click();
        Thread.sleep(1000);
        return this;
    }

    public Product clickOnAllReviewsButtons() throws InterruptedException {
        allReviewsButton.click();
        Thread.sleep(1000);
        return this;
    }

    public Product expectedOneStar() {
        expectedStars.get(0).getText();
        return this;
    }

    public Product expectedTwoStar() {
        expectedStars.get(1).getText();
        return this;
    }

    public Product expectedThreeStar() {
        expectedStars.get(2).getText();
        return this;
    }

    public Product expectedFourStar() {
        expectedStars.get(3).getText();
        return this;
    }

    public Product expectedFiveStar() {
        expectedStars.get(4).getText();
        return this;
    }


    public class ReviewsWithNames {
        String reviewerName;
        int feedback;

        public ReviewsWithNames(String reviewerName, int feedback) {
            this.reviewerName = reviewerName;
            this.feedback = feedback;
        }
    }


    public Product takeReviewStars() {
//        System.out.println(revieweRatingStars.size());
        List<ReviewsWithNames> reviewsWithNames = new ArrayList<>();
        List<Integer> feedback = new ArrayList<>();
        List<String> reviewerName = new ArrayList<>();
        List<String> duplicates = new ArrayList<>();
        boolean isBottom = false;
        while (isBottom == false) {

            for (int i = 0; i < revieweRatingStars.size(); i++) {


                if (revieweRatingStars.get(i).getText().equals("10.0")) {
                    if (i < reviewUsername.size()) {
                        feedback.add(1);
                        reviewerName.add(reviewUsername.get(i).getText());
                    }
                } else if (revieweRatingStars.get(i).getText().equals("20.0")) {
                    if (i < reviewUsername.size()) {
                        feedback.add(2);
                        reviewerName.add(reviewUsername.get(i).getText());
                    }
                } else if (revieweRatingStars.get(i).getText().equals("30.0")) {
                    if (i < reviewUsername.size()) {
                        feedback.add(3);
                        reviewerName.add(reviewUsername.get(i).getText());
                    }
                } else if (revieweRatingStars.get(i).getText().equals("40.0")) {
                    if (i < reviewUsername.size()) {
                        feedback.add(4);
                        reviewerName.add(reviewUsername.get(i).getText());
                    }
                } else if (revieweRatingStars.get(i).getText().equals("50.0")) {
                    if (i < reviewUsername.size()) {
                        feedback.add(5);
                        reviewerName.add(reviewUsername.get(i).getText());
                    }
                }
                if (i < reviewUsername.size()) {
                    if (reviewerName.contains(reviewUsername.get(i).getText())) {

                        for (String names : reviewerName) {
                            if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1).equals(names)) {
                                duplicates.add(names);
                            } else {
                                duplicates = new ArrayList<>();
                                duplicates.add(names);
                            }

                        }

                        if (duplicates.size() == 5) {
                            System.out.println("i reached the bottom of review page");
                            isBottom = true;
                        }
                    }
                }

            }
            System.out.println(duplicates);
            swipeDown();
        }


        return this;
    }
}


