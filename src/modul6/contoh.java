package modul6;

public class contoh {
    public static void main(String[] args) {
        contoh c = new contoh();
        c.tail(22);
        System.out.print(c.fact(12)+" ");

    }

    // TAIL-RECURSION
    void tail(int i){
        if (i > 0){
            System.out.print(i+" ");
            tail(i-1);
        }
    }

    // NON-TAIL RECURSION
    int fact(int x){
        if (x == 0){
            return  1;
        }else {
            return x*fact(x-1);
        }
    }


}
