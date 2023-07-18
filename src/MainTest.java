import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testCreateRectangle() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        Assertions.assertNotEquals(rectangle, null);
    }

    @Test
    public void testCalculateArea() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double expectedArea = 60.0;
        double actualArea = rectangle.calculateArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }


    @Test
    public void testSetWidth() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double newWidth = 7;
        rectangle.setWidth(newWidth);
        double expectedArea = 70.0;
        double actualArea = rectangle.calculateArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testGetWidth() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double actualWidth = rectangle.getWidth();
        Assertions.assertEquals(6.0, actualWidth);
    }

    @Test
    public void testSetAndGetWidth() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double newWidth = 7;
        rectangle.setWidth(newWidth);
        double actualWidth = rectangle.getWidth();
        Assertions.assertEquals(newWidth, actualWidth);
    }

    @Test
    public void testSetHeight() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double newHeight = 11;
        rectangle.setHeight(newHeight);
        double expectedArea = 66.0;
        double actualArea = rectangle.calculateArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testGetHeight() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 12);
        double actualHeight = rectangle.getHeight();
        Assertions.assertEquals(12.0, actualHeight);
    }

    @Test
    public void testSetAndGetHeight() {
        Main.Rectangle rectangle = new Main.Rectangle(6, 10);
        double newHeight = 12;
        rectangle.setHeight(newHeight);
        double actualHeight = rectangle.getHeight();
        Assertions.assertEquals(newHeight, actualHeight);
    }

}