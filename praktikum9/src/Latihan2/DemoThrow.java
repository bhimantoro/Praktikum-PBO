package Latihan2;

public class DemoThrow {
    public static void main(String[] args){
        Barang obj = new Barang();
        obj.setKode(null);
        obj.setNama("Buku tulis");
        obj.setHarga(2500);

        System.out.println("Kode\t: "+obj.getKode());
        System.out.println("Nama\t: "+obj.getNama());
        System.out.println("Harga\t: "+obj.getHarga());
    }
}
