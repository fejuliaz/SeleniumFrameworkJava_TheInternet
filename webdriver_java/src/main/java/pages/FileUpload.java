package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public  FileUpload (WebDriver driver){ this.driver = driver;}

    public void clickUploadButton() {driver.findElement(uploadButton).click();}

    /**
     *
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFiles(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }



}
