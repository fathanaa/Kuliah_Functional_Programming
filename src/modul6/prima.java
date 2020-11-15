package modul6;

public class prima {
    public static void main(String[] args) {
        int input = 5;
        if (cekNilai(input)){
            System.out.println("Angka "+input+" Bilangan Prima");
        }else {
            System.out.println("Angka "+input+" Bukan Bilangan Prima");
        }
    }

    static int NilaiBilPrima(int number, int i){
        if (i == 1){
            return 1;
        }else if (number % i == 0){
            return 1 + NilaiBilPrima(number, --i);
        }else {
            return 0 + NilaiBilPrima(number, --i);
        }
    }

    static boolean cekNilai(int n){
        if (n > 1){
            return (NilaiBilPrima(n, n) == 2);
        } else {
            return false;
        }
    }
}
