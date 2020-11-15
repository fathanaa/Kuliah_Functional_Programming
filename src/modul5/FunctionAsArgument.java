package modul5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionAsArgument {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("B");
        list.add("A");

        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println(list);
    }
}
