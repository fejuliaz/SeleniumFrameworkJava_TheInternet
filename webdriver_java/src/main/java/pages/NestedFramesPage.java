package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){this.driver = driver;}

    private void switchToTopFrame(){
        driver.switchTo().frame(topFrame);
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    private String getFrameText(){
        return driver.findElement(body).getText();
    }

    public String getLeftFrameText(){
        switchToTopFrame();
        switchToLeftFrame();
        String text = getFrameText();
        driver.switchTo().parentFrame();//exit to top
        driver.switchTo().parentFrame();//exit to main
        return text;
    }

    public String getBottomText(){
        switchToBottomFrame();
        String text = getFrameText();
        driver.switchTo().parentFrame();//exit to main
        return text;
    }


}
