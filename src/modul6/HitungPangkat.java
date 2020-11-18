package modul6;

public class HitungPangkat {
    public static void main(String[] args) {
        System.out.println("Hasil Bilangan Pangkat : "+BilPangkat(2,5));
    }

    static int BilPangkat(int x, int y){
        if (y == 0){
            return 1;
        }else {
            return x * BilPangkat(x, y-1);
        }
    }
}
