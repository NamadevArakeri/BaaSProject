package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddChargingStation {
    public WebDriver driver;

    By link = By.xpath("//span[text()='Charge Station List']");

    By link1 = By.xpath("//a[@class='btn btn-primary']");

    By id = By.xpath("//input[@id='mat-input-11']");

    By stationName = By.xpath("//input[@id='mat-input-12']");

    By status = By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c127-25']");

    By select = By.xpath("//span[@class='mat-option-text']");

    By submit = By.xpath("//span[text()='Submit']");

   public AddChargingStation(WebDriver driver){
       this.driver=driver;
   }
    public WebElement getLink(){
        return driver.findElement(link);
    }
    public WebElement getLink1(){
        return driver.findElement(link1);
    }
    public WebElement StationId(){
        return driver.findElement(id);
    }
    public WebElement StationName(){
        return driver.findElement(stationName);
    }
    public WebElement getStatus(){
        return driver.findElement(status);
    }
    public WebElement Select(){
        return driver.findElement(select);
    }
    public WebElement Submit(){
        return driver.findElement(submit);
    }



}
