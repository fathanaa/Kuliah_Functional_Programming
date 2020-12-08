package modul8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamClas {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        String[] array = {"a","b","c","d"};

//        Stream<String> stream1 = Stream.of(array);
//        stream.forEach(p -> System.out.println(p));

        List<String> list = new ArrayList<String>();
        list.add(array[0]);
        list.add(array[1]);
        list.add(array[3]);
        Stream<String> stremlist = list.stream();
        stremlist.forEach(p -> System.out.println(p));

    }
}
