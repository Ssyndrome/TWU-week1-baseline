package bester;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookieTest {
    @Test
    void shouldReturnBestCookie() {
        List<Cookie> cookies = Arrays.asList(new Cookie(1),
                                            new Cookie(2),
                                            new Cookie(3),
                                            new Cookie(4));
        assertEquals(Bester.getBestCookie(cookies),new Cookie(4));
    }
}
