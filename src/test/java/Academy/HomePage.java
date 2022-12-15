package Academy;

import PageObjects.LandingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends base {
    public static Logger log= LogManager.getLogger(base.class.getName());
    @BeforeTest
    public void initialize() throws IOException {
        driver=initializeDriver();
        driver.get("http://localhost:4200/");
        log.info("Successfully Navigated to website");
    }
    @Test
    public void page(){
        LandingPage l = new LandingPage(driver);
        l.page().click();
        log.info("Clicked on Login link");

    }
    @AfterTest
    public void tearDown(){
            driver.close();
            log.info("Browser closed");
    }



}
