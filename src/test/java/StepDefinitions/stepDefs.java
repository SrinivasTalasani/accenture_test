package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObjects.Objects;

public class stepDefs {
    WebDriver driver;

    Objects objects;

    public stepDefs() {

    }

    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\srini\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    @When("User captures userame {string} and password {string}")
    public void user_captures_userame_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User launch url")
    public void userLaunchUrl() throws InterruptedException {


    }


    @Given("User launched url and clicked on electronics")
    public void userLaunchedUrlAndClickedOnElectronics() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://www.takealot.com/");
        objects = new Objects(driver);
        Thread.sleep(5000);
        objects.clickElectronicsLinkLink();
        System.out.println("Clicked on Home appliances");
    }

    @When("User chooses all categories of electronics")
    public void userChoosesAllCategoriesOfElectronics() throws InterruptedException {
        Thread.sleep(5000);
        objects.clickOnElectronics();
    }

    @And("User selects tv categories and selects samsung Tv")
    public void userSelectsTvCategoriesAndSelectsSamsungTv() throws InterruptedException {
        Thread.sleep(3000);
        objects.clickOnTVS();
        objects.clickSamsungLink();
        objects.clickGotItButton();
        objects.clickOnSamsungTvImage();
    }

    @Then("User added Tv to the cart and verified")
    public void userAddedTvToTheCartAndVerified() throws InterruptedException {
        objects.clickGotoCart();
        objects.verifyCartItem();
    }

    @And("User adds his tv to cart")
    public void userAddsHisTvToCart() throws InterruptedException {
        objects.clickOnCartButton();

    }
}