package Academy;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.core.util.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class base {

    public WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("D://E2EProject//src//main//java//resources//data.properties");
        prop.load(fis);
        String browserName=prop.getProperty("browser");

        if(browserName.equals("chrome")) {
            //execute in chrome driver
            System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserName=="firefox") {
            //execute in firefox driver
        }
        else if(browserName=="IE") {

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationFile));
        return destinationFile;
    }
}
