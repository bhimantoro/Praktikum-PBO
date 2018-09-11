package tugasrumah3;
import java.util.Scanner;

/**
 *
 * @author suryo
 */

public class Main{
	public static void main(String[] args) {
		double uang;
		double 	thb = 454.53,
				sgd = 10844.41,
				jpy = 134.74,
				krw = 13.21,
				eur = 17371.80;

		Scanner input = new Scanner(System.in);
		System.out.println("Konversi Mata Uang");
		System.out.println("Menu : \n"+
							"\t 1. IDR - THB\n"+
							"\t 2. THB - IDR\n"+
							"\t 3. IDR - SGD\n"+
							"\t 4. SGD - IDR\n"+
							"\t 5. IDR - JPY\n"+
							"\t 6. JPY - IDR\n"+
							"\t 7. IDR - KRW\n"+
							"\t 8. KRW - IDR\n"+
							"\t 9. IDR - EUR\n"+
							"\t10. EUR - IDR\n"+
							"Pilih Menu : ");
		int menu = input.nextInt();

		switch(menu){
			case 1:
			{
				System.out.println("Kurs : "+thb+" IDR / 1 THB");
				System.out.print("Nominal Uang : IDR ");
				uang = input.nextDouble();
				System.out.println("THB "+ (uang/thb));
				break;
			}
			case 2:
			{
				System.out.println("Kurs : "+thb+" IDR / 1 THB");
				System.out.print("Nominal Uang : THB ");
				uang = input.nextDouble();
				System.out.println("IDR "+ (uang*thb));
				break;
			}
			case 3:
			{
				System.out.println("Kurs : "+sgd+" IDR / 1 SGD");
				System.out.print("Nominal Uang : IDR ");
				uang = input.nextDouble();
				System.out.println("THB "+ (uang/sgd));
				break;
			}
			case 4:
			{
				System.out.println("Kurs : "+sgd+" IDR / 1 SGD");
				System.out.print("Nominal Uang : SGD ");
				uang = input.nextDouble();
				System.out.println("IDR "+ (uang*sgd));
				break;
			}
			case 5:
			{
				System.out.println("Kurs : "+jpy+" IDR / 1 JPY");
				System.out.print("Nominal Uang : IDR ");
				uang = input.nextDouble();
				System.out.println("THB "+ (uang/jpy));
				break;
			}
			case 6:
			{
				System.out.println("Kurs : "+jpy+" IDR / 1 JPY");
				System.out.print("Nominal Uang : JPY ");
				uang = input.nextDouble();
				System.out.println("IDR "+ (uang*jpy));
				break;
			}
			case 7:
			{
				System.out.println("Kurs : "+krw+" IDR / 1 KRW");
				System.out.print("Nominal Uang : IDR ");
				uang = input.nextDouble();
				System.out.println("THB "+ (uang/krw));
				break;
			}
			case 8:
			{
				System.out.println("Kurs : "+krw+" IDR / 1 KRW");
				System.out.print("Nominal Uang : KRW ");
				uang = input.nextDouble();
				System.out.println("IDR "+ (uang*krw));
				break;
			}
			case 9:
			{
				System.out.println("Kurs : "+eur+" IDR / 1 EUR");
				System.out.print("Nominal Uang : IDR ");
				uang = input.nextDouble();
				System.out.println("THB "+ (uang/eur));
				break;
			}
			case 10:
			{
				System.out.println("Kurs : "+eur+" IDR / 1 EUR");
				System.out.print("Nominal Uang : EUR ");
				uang = input.nextDouble();
				System.out.println("IDR "+ (uang*eur));
				break;
			}
			default:
				break;

		}
	}
}