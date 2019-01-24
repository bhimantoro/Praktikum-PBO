package TugasPraktikum;

class Taksi extends Mobil{
    protected int tarifAwal;
    protected int tarifPerKm;

    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public int getTarifAwal(){
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }

    public Taksi(
            int jmlRoda,
            String warna,
            String bahanBakar,
            int kapasitasMesin,
            int tarifAwal,
            int tarifPerKm
    ){
        super.jmlRoda = jmlRoda;
        super.warna = warna;
        super.bahanBakar = bahanBakar;
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    public void cetak(){
        System.out.println("Jumlah Roda  : "+jmlRoda);
        System.out.println("Warna        : "+warna);
        System.out.println("Bahan Bakar  : "+bahanBakar);
        System.out.println("Tarif Awal   : "+tarifAwal);
        System.out.println("Tarif Per Km : "+tarifPerKm);
    }
}
