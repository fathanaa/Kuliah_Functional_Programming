package modul7;

import java.util.function.Supplier;

public class supplierInterface {
    public static void main(String[] args) {
        final String h = "Deep";
        String e = " World";

        System.out.println("----- Supplier + String method [length()] -----");
        Supplier<Integer> suppLength = () -> {
            return h.length();
        };
        System.out.println(suppLength.get());
        System.out.println();

        System.out.println("----- Supplier + String method [concat()] -----");
        Supplier<String> suppConcat = () -> {
            return h.concat(e);
        };
        System.out.println(suppConcat.get());
        System.out.println();

        System.out.println("----- Supplier + String method [subString()] -----");
        Supplier<String> suppSubString = () -> {
            return h.substring(1,3);
        };
        System.out.println(suppSubString.get());
        System.out.println();
    }
}
