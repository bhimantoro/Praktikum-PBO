package TugasRumah.Fibonacci;

import Latihan4.NegativeNumberException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws NegativeNumberException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        int n = input.nextInt();
        if (n<0)
        {
            throw new NegativeNumberException("Tidak boleh negatif");
        }
        long fib[] = new long[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++)
        {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(fib[i] + " ");
        }
    }
}
