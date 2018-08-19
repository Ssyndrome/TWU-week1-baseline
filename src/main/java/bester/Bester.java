package bester;

import java.util.List;
import java.util.stream.IntStream;

public class Bester{

    public Bestful getBest(List<Bestful> list) {

        Bestful result = list.get(0);

        if (!IntStream.range(0,list.size()).allMatch(i-> list.get(0).getClass()==list.get(i).getClass() )){
            return result;
        }
        for (int i = 1; i < list.size(); i++) {
            result = result.compareTo(list.get(i)) ? result : list.get(i);
        }
        return result;
    }
}
