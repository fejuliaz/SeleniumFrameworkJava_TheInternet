package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample1Page (WebDriver driver){this.driver = driver;}

    public void clickStartButton(){
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 5 );
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        //the same as in line 24
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)) //how often to check the condition
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }


}
