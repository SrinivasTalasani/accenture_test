package pageObjects;

import io.cucumber.java.an.E;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.Set;

public class Objects {
    WebDriver driver;

    String model;

    public Objects(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @FindBy(xpath = "//*[text()='NOT NOW']")
    WebElement notNowButton;

    @FindBy(xpath = "//*[text()='TVs']")
    WebElement tvsLink;

    @FindBy(linkText = "TV, Audio & Media")
    WebElement allElectronicsLink;

    @FindBy(xpath = "//img[@alt='Samsung_Orig_Wordmark_BLUE_RGB.jpg']")
    WebElement samsungLink;

    @FindBy(xpath = "//button[text()='Got it']")
    WebElement gotItButton;

    @FindBy(xpath = "//*[@id=\"92979053\"]/div/a")
    WebElement tvModel;

    @FindBy(xpath = "//*[@class='add-to-cart-icon']")
    WebElement addCartButton;
    @FindBy(xpath = "(//*[text()='Go to Cart'])[2]")
    WebElement goToCartButton;

    @FindBy(xpath = "//*[text()='Samsung 50\" CU7000 4K Smart UHD TV with Powerful Adaptive Sound']\n")
    WebElement cartItem;
    @FindBy(xpath = "//div[@class='toggle-module_toggle-knob_1xTxJ']")
    WebElement toggle;


    public void clickElectronicsLinkLink() throws InterruptedException {
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.moveToElement(electronicsLink).perform();
    }

    public void clickGotItButton() {
        try {
            Thread.sleep(3000);
            gotItButton.click();
            System.out.println("Clicked on got it button");
        } catch (Exception e) {
            System.out.println("got it button not available");
        }
    }

    public void clickOnElectronics() throws InterruptedException {
        try {
            Thread.sleep(5000);
            notNowButton.click();
            System.out.println("Clicked on not now button");
        } catch (Exception e) {
            System.out.println("not now button not available");
        }
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.moveToElement(electronicsLink).perform();
        Thread.sleep(3000);
        allElectronicsLink.click();
        System.out.println("clicked on all electronics link");
    }

    public void clickOnTVS() throws InterruptedException {
        Thread.sleep(3000);
        tvsLink.click();
        System.out.println("Clicked on Tvs");
    }

    public void clickSamsungLink() throws InterruptedException {
        Thread.sleep(2000);
        samsungLink.click();
        System.out.println("Clicked on Samsung Link");
    }

    public void clickOnSamsungTvImage() throws InterruptedException {
        toggle.click();
        System.out.println("clicked on toggle");
        Thread.sleep(5000);
        model = tvModel.getText();
        System.out.println(model);
        Thread.sleep(3000);
        tvModel.click();

    }

    public void clickOnCartButton() throws InterruptedException {
        Thread.sleep(5000);
        addCartButton.click();
        System.out.println("Clicked on add to card");

    }

    public void clickGotoCart() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)", "");
        Thread.sleep(3000);
        goToCartButton.click();
        System.out.println("Clicked on go to cart button");
    }

    public void verifyCartItem() {
        cartItem.isDisplayed();
        String item = cartItem.getText();
        System.out.println(item);
        Assert.assertEquals(cartItem, item);
    }

}