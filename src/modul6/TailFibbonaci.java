package modul6;

public class TailFibbonaci {
    public static void main(String[] args) {
        System.out.println("Hasil = "+Fibonacci(8,1,0));
    }
    static int Fibonacci(int num, int prev, int current){
        if (num == 0){
            return current;
        }else {
            return Fibonacci(num -1,prev + current,prev);
        }
    }
}
