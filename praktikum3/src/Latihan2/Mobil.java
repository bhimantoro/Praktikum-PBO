package Latihan2;
/**
 *
 * @author suryo
 */
public class Mobil {
    /*diubah menjadi public untuk soal d*/
	public int id_mobil;
	public String merk;
	public int kapasitas;
	public int harga_sewa;

	public Mobil(int no, String tipe, int jumlah, int harga){
		id_mobil = no;
        merk = tipe;
		kapasitas = jumlah;
        harga_sewa = harga;
	}
	public void setIdMobil(int i){
		id_mobil = i;
	}
	public int getIdMobil(){
		return id_mobil;
	}
	public void setMerkMobil(String i){
		merk = i;		
	}
	public String getMerkMobil(){
		return merk;
	}
	public void setKapasitasMobil(int i){
		kapasitas = i;
	}
	public int getKapasitasMobil(){
		return kapasitas;
	}
	public void setHargaMobil(int i){
		harga_sewa = i;
	}
	public int getHargaMobil(){
		return harga_sewa;
	}
	public void cetakMobil(){
        System.out.println("no\t\t: "+id_mobil);
        System.out.println("merk\t\t: "+merk);
        System.out.println("kapasitas\t: "+kapasitas);
        System.out.println("harga_sewa\t: "+harga_sewa);
	} //soal e
}
