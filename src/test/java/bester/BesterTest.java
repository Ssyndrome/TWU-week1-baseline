package bester;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BesterTest {
    @Test
    void should_return_best() {
        Bester bester = new Bester();
        List<Bestful> bestfuls = Arrays.asList(new Cookie(1),
                                                new Rectangle(1,2));
        Bestful expected;
        assertEquals(null,bester.getBest(bestfuls));
    }
}