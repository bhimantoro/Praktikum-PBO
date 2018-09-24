package TugasRumah1;

public class Artis {
    private String pengisiAcara;
    private String kategori;
    private String transportasi;
    private int jumlah;
    private int bayaran;

    public Artis(String A, String B, String C, int D, int E) {
        pengisiAcara = A;
        kategori = B;
        transportasi = C;
        jumlah = D;
        bayaran = E;
    }

    public void setPengisiAcara(String i) {
        pengisiAcara = i;
    }
    public String getPengisiAcara() {
        return pengisiAcara;
    }
    
    public void setKategori(String i){
        kategori = i;
    }
    public String getKategori() {
        return kategori;
    }
    
    public void setTransportasi(String i){
        transportasi = i;
    }
    public String getTransportasi() {
        return transportasi;
    }

    public void setJumlah(int i){
        jumlah = i;
    }
    public int getJumlah() {
        return jumlah;
    }

    public void setBayaran(int i){
        bayaran = i;
    }
    public int getBayaran() {
        return bayaran;
    }

    public void infoArtis(){
        System.out.println("Pengisi Acara\t: "+pengisiAcara);
        System.out.println("Kategori\t\t: "+kategori);
        System.out.println("Transportasi\t: "+transportasi);
        System.out.println("Jumlah\t\t\t: "+jumlah+" orang");
        System.out.println("Bayaran\t\t\t: "+bayaran);
    }
}
