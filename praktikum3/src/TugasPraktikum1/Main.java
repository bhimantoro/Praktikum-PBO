package TugasPraktikum1;
/**
 *
 * @author suryo
 */
class Tabungan {
	private int saldo;
    private int jumlah;
	public Tabungan(int saldo){
		this.saldo = saldo;
	}
	public int getSaldo(){
		return saldo;
	}
	public int simpanUang(int jumlah){
		return saldo += jumlah;
	}
    public boolean ambilUang(int jumlah){
		if (saldo>jumlah) {
			saldo -= jumlah;
			return true;
		}
		else {
			return false;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		boolean status;
		Tabungan nabung = new Tabungan(5000);
        System.out.println("Saldo awal : "+nabung.getSaldo());
        nabung.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = nabung.ambilUang(6000);
        System.out.print("JUmlah uang yang diambil : 6000");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        nabung.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status = nabung.ambilUang(4000);
        System.out.print("JUmlah uang yang diambil : 4000");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        status = nabung.ambilUang(1600);
        System.out.print("JUmlah uang yang diambil : 1600");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        nabung.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = "+nabung.getSaldo());
	}
}
