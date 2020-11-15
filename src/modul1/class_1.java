package modul1;
// Dari java 8 dan seterusnya, saya bisa menggunakan Lambda Expression untuk menerapkan fungsi interface
// Syntax : (modifier) interface (nama_interface)
// Anotasi: @FunctionalInterface

// Ekspresi Lambda merupakan kode program yang mengambiil
// Nilai parameter dan mengembalikan nilai
// Sintaks : (argument) -> {ekspresi}

import java.util.concurrent.Callable;

// Ekspresi Lambda tanpa parameter
class class_1 {
    public static void main(String[] args) {
        Buku buku = () -> {
            System.out.println("Ini buku GoT");
        };
        buku.nama();
    }

    @FunctionalInterface
    interface Buku{
        void nama();
    }
}

// Ekspresi Lambda dengan satu parameter
class class_2{
    public static void main(String[] args) {
        Buku buku = (nama) -> {
            System.out.println("Ini Buku "+nama);
        };
        buku.nama("LotR");

        Buku buku1 = (nama) -> {
            System.out.println("Ini Buku "+nama);
        };
        buku1.nama("LotR");

    }

    @FunctionalInterface
    interface Buku{
        void nama(String nama);
    }
}

// Ekspresi Lambda dengan banyak parameter dengan ekplisit argument
class class_3{
    public static void main(String[] args) {
        Buku buku = (String nama, int blok) -> {
            System.out.println("Ini buku "+nama+ " di blok "+blok);
        };
        buku.nama("Sapiens",12);
    }

    @FunctionalInterface
    interface Buku{
        void nama(String nama, int blok);
    }
}
// Ekspresi Lambda dengan banyak statement dan return
class class_4{
    public static void main(String[] args) {
        Segitiga segitiga = (int alas, int tinggi) -> {
            System.out.println("Alas : "+alas);
            System.out.println("Tinggi : "+tinggi);
            return (alas+tinggi)/2;
        };
        System.out.println("Luas : "+segitiga.luas(10,2));
    }

    interface Segitiga{
        int luas(int alas, int tinggi);
    }
}

// The Runnable Interface
// merupakan kelas inteface yang mampu menjalakan kode java pada saat yang bersamaan
// dengan bantuan Thread.
class class_5{
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello. Good Evening");
        }).start();
    }
}

// The Callable Interface
class class_6{
    public static void main(String[] args) {
        try {
            Callable<String> hi = () -> "Hello, Good Morning from callable";
            System.out.println(hi.call());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

// Latihan 1
class Mathematical{
    public static void main(String[] args) {
        Mathematical math = new Mathematical();

        MathOps tambah = (a, b) -> {
            return a+b;
        };
        System.out.println("10 + 5 = "+math.operate(10,5,tambah));

        MathOps kurang = (a, b) -> {
            return a-b;
        };
        System.out.println("10 - 5 = "+math.operate(10,5,kurang));

        MathOps kali = (a, b) -> {
            return a*b;
        };
        System.out.println("10 x 5 = "+math.operate(10,5,kali));

        MathOps bagi = (a,b) -> {
          return a/b;
        };
        System.out.println("10 / 5 = "+math.operate(10,5,bagi));

    }
    interface MathOps {
        int operation(int a, int b);
    }
    int operate (int a, int b, MathOps mathOps) {
        return mathOps.operation(a, b);
    }
}

// Pertanyaan tulis dibawah ini