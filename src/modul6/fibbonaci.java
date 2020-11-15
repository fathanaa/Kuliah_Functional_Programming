package modul6;

public class fibbonaci {
    public static void main(String[] args) {
        int x = 10;
        int i = 0;
        for (; i<=x; i++){
            System.out.println("F(" +i+ ") = "+calculateFibo(i));
        }
    }

    static int calculateFibo (int i){

        if (i <= 0 || i <= 1){
            return i;
        }else {
            return calculateFibo(i-1)+calculateFibo(i-2);
        }
    }
}
