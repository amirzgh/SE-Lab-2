import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCreateRectangle() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        Assertions.assertNotEquals(rectangle,null);
    }
    @Test
    public void testCalculateArea() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double expectedArea = 60.0;
        double actualArea = rectangle.calculate();
        Assertions.assertEquals(expectedArea, actualArea);
    }
}