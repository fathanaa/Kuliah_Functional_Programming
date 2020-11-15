package modul3;

import java.util.Scanner;

class class_1{
    public static void main(String[] args) {
        exercise ex = () ->{
          return "null stirng";
        };
        System.out.println("Isi kalimat adalah : "+ex.kalimat());
    }
    @FunctionalInterface
    interface exercise {
        String kalimat();
    }
}

class class_2{
    public static void main(String[] args) {
        exercise ex = () -> {
            System.out.println("this running void interface");
        };
        ex.kalimat();
    }

    @FunctionalInterface
    interface exercise {
        void kalimat();
    }
}

class class_3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        isOdd o = (a) -> {
            if (a % 2 == 0){
                System.out.println("a itu genap");
            }else {
                System.out.println("a itu ganjil");
            }
           return a;
        };
        System.out.println("Input A");
        o.number(input.nextInt());
    }

    interface isOdd{
        int number(int a);
    }
}

class class_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pangkatDua pangkatDua = (i) -> {
            System.out.println("Pangkat untuk  dari "+i+" adalah "+i*i);
            return i;
        };
        System.out.print("Masukan angka : ");
        pangkatDua.hitungPangkat(input.nextInt());

    }

    @FunctionalInterface
    interface pangkatDua{
        int hitungPangkat(int i);
    }
}