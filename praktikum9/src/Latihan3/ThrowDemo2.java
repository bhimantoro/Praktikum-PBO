package Latihan3;

public class ThrowDemo2 {
    public static void test(int n){
        if (n<0){
            throw new NullPointerException("KESALAHAN: null pointer");
        }
        else {
            throw new ArithmeticException("KESALAHAN: arithmetic exception");
        }
    }
    public static void main(String[] args){
        try {
            test(-12);
            test(0);
        }
        catch (Exception e){
            System.out.println("Eksepsi ditangkap disini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statement setelah blok try-catch");
    }
}
