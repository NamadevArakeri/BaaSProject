package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    By email = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By click = By.name("signInSubmitButton");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement clickButton(){
        return driver.findElement(click);
    }

}
