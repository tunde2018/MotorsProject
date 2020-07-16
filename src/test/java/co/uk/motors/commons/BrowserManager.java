package co.uk.motors.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager {

    // help make my browser running
    // BrowserManager depends on DriverManager
    // extends linked BrowserManager to DriverManager
    // what I have here is BrowserManager and is extending DriverManager,
    // and its what give me my drivers bellow

    private WebDriver initChrome()

    // run what you can see
    // private mean only for this application
    // this initialised chrome (to return something)

    {
        WebDriverManager.chromedriver().setup();

        // here I set up chrome for selenium to navigate to

        return new ChromeDriver();

    }

    private WebDriver initHeadlessChrome()

    // run what you can not see
    // this initialised
    // private mean only for this application
    // this initialised chrome (to return something)
    {
        WebDriverManager.chromedriver().setup();

        // here I set up chrome for selenium to navigate to

        ChromeOptions options = new ChromeOptions();

        // this also mean initialising

        options.addArguments("--disable-gpu", "headless");

        // option.addArguments("--disable-gpu", "headless"); meaning I want to disable the graphic processing unit and run it
        // headless

        return new ChromeDriver(options);

    }

    private WebDriver iniFirefox()

    // run what you can see
    // private mean only for this application
    // this initialised chrome (to return something)

    {
        WebDriverManager.firefoxdriver().setup();

        // here I set up chrome for selenium to navigate to

        return new FirefoxDriver();

    }

    private WebDriver initHeadlessFirefox()

    // run what you can not see
    // this initialised
    // private mean only for this application
    // this initialised chrome (to return something)

    {
        WebDriverManager.firefoxdriver().setup();

        // here I set up chrome for selenium to navigate to

        FirefoxOptions options = new FirefoxOptions();

        // this also mean initialising

        options.addArguments("--disable-gpu", "headless");

        // option.addArguments("--disable-gpu", "headless"); meaning I want to disable the graphic processing unit and run it
        // headless

        return new FirefoxDriver(options);

        // I create internet explorer, chromium, and all other browsers

    }

    public void launchBrowser(String browser)

    // here I want to parameterised
    {
        switch (browser)

        // this allow me to switch browsers

        {
            case "Chrome":

                // this mean if the browser is chrome

                driver = initChrome();

                // this came from DriverManager

                 break;

            // break; will stop it from running

            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "Firefox":
                driver = iniFirefox();
                break;
            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;


            // in case I passed something wrong in (for example Chrame instead of Chrome)
            default:
                driver = initHeadlessChrome();
                break;
        }

        // I want driver help me manage my window, open window and maximise it

        driver.manage().window().maximize();

        // because selenium driver is too fast, here I want it to slow down for 10 seconds,
        // meaning if it get to a and cant find it should wait for 10 seconds

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // here it mean when the page is not load on time the selenium die off

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


    }

    // class that will close browser

    public void closeBrowser()
    {

        // this allow me to manage and delete all cookies
        driver.manage().deleteAllCookies();

        // This quit all cookies once deleted

        driver.quit();
    }


}
