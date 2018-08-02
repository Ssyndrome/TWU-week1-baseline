package bester;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Bester {


    public static Cookie getBestCookie(List<Cookie> cookies) {

        Cookie result = cookies.stream().max(Comparator.comparing(cookie -> cookie.getNumberOfChocolateChips()));
    }

    public Rectangle compare(List<Rectangle> recList) {

        Rectangle result = null;
        for (int i = 0; i < recList.size() - 1; i++) {
            if (recList.get(i).area() < recList.get(i + 1).area()) {
                result = recList.get(i+1);
            } else {
                result = recList.get(i);
            }
        }
        return result;
    }
}
