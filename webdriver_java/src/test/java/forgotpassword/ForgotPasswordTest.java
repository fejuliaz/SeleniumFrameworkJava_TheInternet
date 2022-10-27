package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTests {

    @Test

    public void forgotPasswordTest(){

        ForgotPasswordPage forgotPassPage = homePage.clickForgotPassword();
        forgotPassPage.setEmail("tau@example.com");
        forgotPassPage.clickRetrieveButton();

    }
}
