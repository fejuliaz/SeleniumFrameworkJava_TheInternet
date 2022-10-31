package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class EntryAdTests extends BaseTests {

    @Test
    public void handleEntryAd(){
        var entryAdPage = homePage.clickEntryAd();

        entryAdPage.clickCloseButton();


        assertEquals(entryAdPage.getReactiveLink(),"click here", "Element is not visible");

    }
}
