package co.uk.motors.hooks;

import co.uk.motors.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager
    // what happen here is when I browser of my choice
        // and when finish testing it tear it down for me
        // Hook help to close and open a browser
{

    // select@Before (io.cucumber.java)
    @Before

    //public void setUp() all me to set up browser
    public void setUp()
    {
        // launchBrowser("Chrome") all me to launchChrome
        launchBrowser("Chrome");
    }
    // @After (io.cucumber.java)
    @After

    // to close browser
    public void tearDown()
    {
        // browser closed
      closeBrowser();
    }
}
