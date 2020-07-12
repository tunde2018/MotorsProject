package co.uk.motors.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SearchSteps {

    WebDriver driver;

    @Given("I navigate to Motors homepage")
    public void i_navigate_to_Motors_homepage() {

        //Launch a browser
        //Enters the url
        //navigates the url

        // to launch chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // WebDriverManager.chromedriver().setup(); will launch a chrome  browser


       // to launch firefox
        //WebDriverManager.firefoxdriver().setup(); will launch firefox browser
       // driver = new FirefoxDriver();

        // to launch Internet explorer
        //WebDriverManager.iedriver().setup();
        //driver = new InternetExplorerDriver();

        driver.navigate().to( "https://www.motors.co.uk/");


    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String postcode) {
        driver.findElement(By.className("PostCode")).sendKeys(postcode);

    }

    @When("I select {string} from any car make")
    public void i_select_from_any_car_make(String string) {


    }

    @When("I select {string} from any car model")
    public void i_select_from_any_car_model(String string) {

    }

    @When("I select {string} from Min price")
    public void i_select_from_Min_price(String string) {

    }

    @When("I select {string} from Max price")
    public void i_select_from_Max_price(String string) {

    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {

    }

    @Then("the search {string} is displayed")
    public void the_search_is_displayed(String string) {

    }
    @Then("an error page is displayed")
    public void an_error_page_is_displayed() {

    }

    @When("I select <{string} from any car make")
    public void iSelectFromAnyCarMake(String arg0) {
    }
}

