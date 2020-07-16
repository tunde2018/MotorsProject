package co.uk.motors.pages;

import co.uk.motors.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager

{
    public String BASE_URL = "https://www.motors.co.uk/";

    public Select select;

    public void launchURL()

    {
        driver.navigate().to(BASE_URL);
    }
    // use this class to select anything
    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.deselectByIndex(index);
    }
}
