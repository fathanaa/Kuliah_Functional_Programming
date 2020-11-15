package modul2;

import java.util.ArrayList;

class class_1 {
    public static void main(String[] args) {
        new Thread(() -> {
            byte min,max;
            min = Byte.MIN_VALUE;
            max = Byte.MAX_VALUE;
            System.out.println("Min size "+min);
            System.out.println("Min size "+max);
        }).start();
    }
}

class class_2 {
    public static void main(String[] args) {
        new Thread(() -> {
            short min,max;
            min = Short.MIN_VALUE;
            max = Short.MAX_VALUE;
            System.out.println("Min size "+min);
            System.out.println("Min size "+max);
        }).start();
    }
}

class class_4 {
    public static void main(String[] args) {
        Lingkaran lingkaran = (p, r) -> {
            System.out.println("PI : "+p);
            System.out.println("r : "+r);
            return p * r*r;
        };
        System.out.println("Luas Lingkaran : "+lingkaran.luas(3.14,24));

    }
    interface Lingkaran{
        double luas(double p, double r);
    }
}


class class_3{
    public static void main(String[] args) {
        new Thread(() -> {
            double p,r;
            p = 3.14;r = 12;
            System.out.println("PI : "+p+" r : "+r);
        }).start();

    }
}

/*
Collection adalah framework yang menyimpan dan memodifikasi
sebuah objek. Didalam collection terdapat Set, List, Queue sebagai interface
dan ArrayList, LinkedList, Vector sebagai class.
*/
class class_5{
    public static void main(String[] args) {
        new Thread(() -> {
            ArrayList <String> arrayList = new ArrayList<String>();
            arrayList.add("Ferrari");
            arrayList.add("Tesla");
            arrayList.add("Hyundai");
            arrayList.add("Ford");
            System.out.println("Isi ArrayList adalah : "+arrayList);
        }).start();
    }
}

// Tugas 1
class class_6{
    public static void main(String[] args) {
        conv c = (far) -> {
            System.out.println("Suhu dalam Fahrenheit : "+far);
            return (far - 32) * 5/9;
        };
        System.out.println("Fahrenheit >> Celcius : "+c.fartocel(77));
    }

    @FunctionalInterface
    interface conv{
        double fartocel(double far);
    }
}

class class_7{
    public static void main(String[] args) {
        processor stringProc = (str) -> {
            return str.length();
        };

        String teks = "Java Lambdda";
        int len = stringProc.getStringLen(teks);
        System.out.println("Panjang kalimat ada "+len+" huruf");
    }

    @FunctionalInterface
    interface processor{
        int getStringLen(String str);
    }
}