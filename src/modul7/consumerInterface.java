package modul7;

import java.util.function.Consumer;

public class consumerInterface {
    public static void main(String[] args) {
        final String h = "Deep World";
        final String e = " !!";

        System.out.println("----- Consumer + String method [length()] -----");
        Consumer<String> conLength = (x) -> {
            System.out.println(x.length());
        };
        conLength.accept(h);
        System.out.println();

        System.out.println("----- Consumer + String method [concat()] -----");
        Consumer<String> conConcat = (x) -> {
            System.out.println(x.concat(e));
        };
        conConcat.accept(h);
        System.out.println();

        System.out.println("----- Consumer + String method [charAt()] -----");
        Consumer<String> conCharAt = (x) -> {
            System.out.println(x.charAt(0));
        };
        conCharAt.accept(h);
        System.out.println();
    }
}
