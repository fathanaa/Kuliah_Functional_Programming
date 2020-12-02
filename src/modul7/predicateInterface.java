package modul7;

import java.util.function.Predicate;

public class predicateInterface {
    public static void main(String[] args) {
        final String h = "Deep Learning";
        String e = " !?";

        System.out.println("--- Predicate + String Method [length()] ----");
        Predicate<String> predLength = x -> {
            return x.length() > 10;
        };
        System.out.println(predLength.test(h));
        System.out.println();

        System.out.println("----- Consumer + String method [concat()] -----");
        Predicate<String> predConcat = x -> {
            return Boolean.parseBoolean(x.concat(e));
        };
        System.out.println(predConcat.test(h));
        System.out.println();

        System.out.println("----- Consumer + String method [charAt()] -----");
        Predicate<String> predcharAt = x -> {
            return x.charAt(1) == 'e';
        };
        System.out.println(predcharAt.test(h));
        System.out.println();


    }
}
