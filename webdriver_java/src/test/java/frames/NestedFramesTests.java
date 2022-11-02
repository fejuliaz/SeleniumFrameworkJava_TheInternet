package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test

    public void testFrameText(){
        var nestedFramesPage = homePage.clickNestedPage();
        String textLeftFrame= nestedFramesPage.getLeftFrameText();
        String textBottomFrame = nestedFramesPage.getBottomText();

        assertEquals(textLeftFrame, "LEFT", " Wrong text in Frame");
        assertEquals(textBottomFrame, "BOTTOM", "Wrong text in frame");
    }
}
