package Academy;

import PageObjects.AddChargingStation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class addStation extends base{
    public static Logger log= LogManager.getLogger(base.class.getName());
    @BeforeTest
    public void initialize() throws IOException {
        driver=initializeDriver();
        driver.get("http://localhost:4200/");
        log.info("Successfully Navigated to website");
    }
    @Test
    public void addChargingStationDetails() {
        AddChargingStation st = new AddChargingStation(driver);
        st.getLink().click();
        st.getLink1().click();
        st.StationId().sendKeys("100");
        st.StationName().sendKeys("Bhoruka");
        st.getStatus().click();
        st.Select().click();
        st.Submit().click();
    }
        @AfterTest
                public void tearDown(){
            driver.close();
        }



}
