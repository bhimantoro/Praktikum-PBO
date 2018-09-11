/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrumah2;
import java.util.Scanner;

/**
 *
 * @author suryo
 */

public class Atm {
	int pin;
	double saldo;

	public void setPin(int password){
		this.pin = password;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public int getPin(){
		return pin;
	}
	public double getSaldo(){
		return saldo;
	}
}

public class Main {
	Scanner input = new Scanner(System.in);
	Atm atm = new Atm();
	double minSaldo = 50000;
	int pil;

	public static void main(String[] args){
		Atm program = new Atm();
		program.initSaldo(200000);
		program.login();
	}

	public void initSaldo(double saldo){
		atm.setSaldo(saldo);
	}



	public void menu(){
		System.out.print
			("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
			 "\tATM\n"+
			 "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
			 "\t>Menu Transaksi<\n"+
			 "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
			 "[1]Informasi Saldo\n"+
			 "[2]Setor Tunai\n"+
			 "[3]Penarikan Uang\n"+
			 "[4]Keluar\n"+
			 "Masukkan Pilihan : ");
		pil = input.nextInt();
		switch (pil) {
			case 1:
			{
				infoSaldo();
				break;
			}
			case 2:
			{
				setorTunai();
				break;
			}
			case 3:
			{
				penarikanUang();
				break;
			}
			case 4:
			{
				System.out.println("Terima Kasih.");
				break;
			}
			default:
				System.out.print("Pilihan Menu Salah!!!");
				break;
		}
	}

	public void login(){
		int pin;
		Atm.setPin(1234);
		System.out.print("Masukkan pin anda : ");
		pin = input.nextInt();
		if (atm.getPin() == pin) {
			menu();
		}
		else{
			System.out.println("Pin Salah!!!");
			login();
		}
	}

	public void lihatSaldo(){
		System.out.println("Informasi Saldo Anda : " + atm.getSaldo());
	}

	public void setorTunai(){

	}

	public void penarikanUang(){
		System.out.println("");
	}

	
}