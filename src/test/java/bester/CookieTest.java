package bester;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookieTest {
    Bester bester = new Bester();

    @Test
    public void shouldReturnBestCookie() {
        List<Bestful> cookies = Arrays.asList(new Cookie(1),
                                            new Cookie(2),
                                            new Cookie(3),
                                            new Cookie(4));
        assertEquals(bester.getBest(cookies),new Cookie(4));
    }
}
