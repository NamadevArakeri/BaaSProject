package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage  {

    public WebDriver driver;
    By signin = By.xpath("//a[text()='Login']");

    public LandingPage(WebDriver driver){

        this.driver=driver;
    }
    public WebElement page(){

        return driver.findElement(signin);
    }

}
