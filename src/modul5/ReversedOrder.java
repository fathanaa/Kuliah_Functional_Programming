package modul5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");

        Comparator<String> comparator = (String a, String b) -> {
            return a.compareTo(b);
        };

        Comparator<String> comparatorReversed = comparator.reversed();
        Collections.sort(list, comparatorReversed);
        System.out.println(list);
    }
}
