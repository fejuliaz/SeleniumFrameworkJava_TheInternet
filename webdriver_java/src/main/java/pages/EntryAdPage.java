package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EntryAdPage {

    private WebDriver driver;
    private By closeAdButton = By.xpath("//div//p[contains(text(),'Close')]");
    private By reActivateAdLink = By.id("restart-ad");

    public EntryAdPage(WebDriver driver){this.driver = driver;}

    public void clickCloseButton(){
        WebElement closeButton = driver.findElement(closeAdButton);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        closeButton.click();
    }

    public void clickReactiveLink(){
        driver.findElement(reActivateAdLink).click();
    }


    public String getReactiveLink(){
        return driver.findElement(reActivateAdLink).getText();
    }


}
