package TugasRumah1;
import java.util.Scanner;

public class TesLP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasPermukaanBola LP = new LuasPermukaanBola();

        System.out.println("Luas Permukaan Bola");

        System.out.print("Masukkan jari - jari : ");
        double r = input.nextDouble(); LP.setR(r);

        System.out.println("Luas Permukaan Bola = "+LP.getLP());
    }
}
