package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFieldUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFiles("C:\\Users\\a263871\\IdeaProjects\\SeleniumFrameworkJava_TheInternet\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", " File is incorrect");
    }
}
