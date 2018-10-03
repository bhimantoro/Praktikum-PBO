package TugasRumah2;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;

    public void setNamaAwal(String namaAwal){
        this.namaAwal = namaAwal;
    }
    public void setNamaAkhir(String namaAkhir){
        this.namaAkhir = namaAkhir;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public String getNamaAwal(){
        return namaAwal;
    }
    public String getNamaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }

    public String toString(){
        return namaAwal + " " + namaAkhir + " dengan saldo "+getTabungan().getSaldo();
    }
}