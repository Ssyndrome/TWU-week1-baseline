package bester;

import java.util.List;

public class Bester {


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
