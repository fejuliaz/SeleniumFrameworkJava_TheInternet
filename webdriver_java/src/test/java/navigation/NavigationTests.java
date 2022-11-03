package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com/");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindow().clickHereLink();
        getWindowManager().switchToTab("New Window");
    }


}
