package bester;

import java.util.List;

public class Bester{

    public Bestful getBest(List<Bestful> list) {

        Bestful result = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i+1))) {
                result = list.get(i+1);
            } else {
                result = list.get(i);
            }
        }
        return result;
    }
}
