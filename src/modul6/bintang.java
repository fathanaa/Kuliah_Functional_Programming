package modul6;

public class bintang {
    public static void main(String[] args) {
        Cetak(1,1,5);
    }
    static void Cetak(int baris, int kolom, int jumlah){
        if (baris <= jumlah){
            if (kolom <= baris){
                System.out.print("* ");
            }
            if (kolom == baris){
                System.out.println();
                Cetak(++baris, 1, jumlah);
            }else {
               Cetak(baris, ++kolom, jumlah);
            }
        }
    }
}
