package modul7;

public class kelas1 {
    public static void main(String[] args) {
        char[] helloArray = {'h','e','l','l','o',};
        String hellostring = new String(helloArray);
        String h = " deep world";

        System.out.println(hellostring);
        // charAt()
        System.out.println("CharAt() = "+ h.charAt(0));
        // length()
        System.out.println("length() = "+ h.length());
        // concat()
        System.out.println("concat() = "+ h.concat(h));
        // substring()
        System.out.println("substring() = "+ h.substring(0,3));
        // trim()
        System.out.println("trim() = "+ h.trim());
        // find indexOf()
        System.out.println("indexOf() = "+ h.indexOf('l'));
        // case font string
        System.out.println("uppercase = "+ h.toUpperCase());
        // replace()
        System.out.println("replace() = "+ h.replace('e','o'));
        //
    }
}
