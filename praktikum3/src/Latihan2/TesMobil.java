package Latihan2;
/**
 *
 * @author suryo
 */
public class TesMobil{
	public static void main(String[] args) {
		Mobil m1 = new Mobil(1, "Daihatsu", 2, 150);
		Mobil m2 = new Mobil(2, "Nissan", 4, 250);
		Mobil m3 = new Mobil(3, "Honda", 7, 200);

		System.out.println("Mobil "+m1.getIdMobil()+" dengan merk "+m1.getMerkMobil()+" memiliki kapasitas "+m1.getKapasitasMobil()+" dengan sewa per jam-nya sebesar "+m1.getHargaMobil()+"K");
		System.out.println("Mobil "+m2.getIdMobil()+" dengan merk "+m2.getMerkMobil()+" memiliki kapasitas "+m2.getKapasitasMobil()+" dengan sewa per jam-nya sebesar "+m2.getHargaMobil()+"K");
		System.out.println("Mobil "+m3.getIdMobil()+" dengan merk "+m3.getMerkMobil()+" memiliki kapasitas "+m3.getKapasitasMobil()+" dengan sewa per jam-nya sebesar "+m3.getHargaMobil()+"K");
        //soal d
        System.out.println("soal d");
        System.out.println("no\t\t: "+m1.id_mobil);
        System.out.println("merk\t\t: "+m1.merk);
        System.out.println("kapasitas\t: "+m1.kapasitas);
        System.out.println("harga_sewa\t: "+m1.harga_sewa);
        
        //soal f
		System.out.println("soal f");
        m1.cetakMobil();
        m2.cetakMobil();
        m3.cetakMobil();
	}
}