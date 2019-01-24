package TugasPraktikum;

class Truk extends Mobil{
    protected int muatanMaks;

    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    public int getMuatanMaks(){
        return muatanMaks;
    }

    public Truk(
            int jmlRoda,
            String warna,
            String bahanBakar,
            int kapasitasMesin,
            int muatanMaks
    ){
        super.jmlRoda = jmlRoda;
        super.warna = warna;
        super.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
        this.muatanMaks = muatanMaks;
    }
    public void cetak(){
        System.out.println("Jumlah Roda     : "+jmlRoda);
        System.out.println("Warna           : "+warna);
        System.out.println("Bahan Bakar     : "+bahanBakar);
        System.out.println("Kapasitas Mesin : "+kapasitasMesin);
        System.out.println("Muatan Maks     : "+muatanMaks);
    }
}

