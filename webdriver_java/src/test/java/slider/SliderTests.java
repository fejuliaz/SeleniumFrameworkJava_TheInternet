package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void slideHorizontalTests(){
        var slidePage= homePage.clickHorizontalSlider();
        String value = "4";
        slidePage.setSliderValue(value);
        assertEquals(slidePage.getSliderValue(),value, "Slider value is incorrect");
    }
}
