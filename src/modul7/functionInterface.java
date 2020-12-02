package modul7;

import java.util.function.Function;

public class functionInterface {
    public static void main(String[] args) {
        final String h = "Deep World";
        String e = " !!";

        System.out.println("----- Function + String method [Length()] -----");
        Function<String, Integer> funcLength = (x) -> {
            return x.length();
        };
        Integer contoh1 = funcLength.apply(h);
        System.out.println("Panjang Kalimat "+h+" ada "+contoh1+" huruf");
        System.out.println();

        System.out.println("----- Function + String method [Concat()] -----");
        Function<String, String> funcConcat = (x) -> {
            return x.concat(e);
        };
        String conton2 = funcConcat.apply(h);
        System.out.println(conton2);
        System.out.println();

        System.out.println("----- Function + String method [CharAt()] -----");
        Function<String, Character> funcCharAt = (x) -> {
            return x.charAt(0);
        };
        Character contoh3 = funcCharAt.apply(h);
        System.out.println(contoh3);
        System.out.println();

        System.out.println("----- Function + String method [Replace()] -----");
        Function<String, String> funcReplace = (x) -> {
            return x.replace('e','o');
        };
        String contoh4 = funcReplace.apply(h);
        System.out.println(contoh4);
        System.out.println();


    }
}
