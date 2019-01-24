package TugasPraktikum;

public class Tes {
    public static void main(String[] args){
        Truk truk1 = new Truk(4, "Kuning", "solar", 1500, 1000);
        Truk truk2 = new Truk(6, "merah", "Solar", 2000, 5000);
        Taksi taksi1 = new Taksi(4, "orange", "bensin", 1500, 10000, 5000);
        Taksi taksi2 = new Taksi(4, "biru", "bensin", 1300, 7000, 3500);
        Sepeda sepeda1 = new Sepeda(3, "Hitam", 1, 2);
        Sepeda sepeda2 = new Sepeda(2, "Putih", 2, 5);

        System.out.println("\nTruk 1");truk1.cetak();
        System.out.println("\nTruk 2");truk2.cetak();

        System.out.println("\nTaksi 1");taksi1.cetak();
        System.out.println("\nTaksi 2");taksi2.cetak();

        System.out.println("\nSepeda 1");sepeda1.cetak();
        System.out.println("\nSepeda 2");sepeda2.cetak();
    }
}
