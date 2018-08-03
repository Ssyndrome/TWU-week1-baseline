package bester;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {

    Bester bester = new Bester();
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnBestRectangle() {
        List<Bestful> recList = Arrays.asList(new Rectangle(1,2),new Rectangle(1,3),new Rectangle(1,4),new Rectangle(1,5));
        assertEquals(bester.getBest(recList), new Rectangle(1,5));
    }
}
