package bester;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CookieTest {
    Bester bester = new Bester();

    @Test
    public void shouldReturnBestCookie() {
        List<Bestful> cookies = Arrays.asList(new Cookie(4),
                                            new Cookie(3),
                                            new Cookie(3),
                                            new Cookie(5),
                                            new Cookie(1));
        assertTrue(bester.getBest(cookies).equals(new Cookie(5)));
    }
}
