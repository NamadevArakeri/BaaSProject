package Academy;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class login extends base{
    public static Logger log= LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver=initializeDriver();
//        driver.get("http://localhost:4200/");
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username,String Password,String Text){
        LandingPage l = new LandingPage(driver);
        driver.get("http://localhost:4200/");
        l.page().click();
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
        System.out.println(Text);
        lp.clickButton().click();
        log.info("Login is Verified with valid credentials");
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][3];
        //0 th row
        data[0][0] = "ba.namadevaa@tataelxsi.co.in";
        data[0][1]= "Dev@1996";
        data[0][2]="Restricted user";
        log.info("Login with restricted users");
        //1st row
        data[1][0]="restricted@qw.com";
        data[1][1]="465758";
        data[1][2]="Non-restricted user";
        log.info("login non-restricted users...");
        return data;
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
