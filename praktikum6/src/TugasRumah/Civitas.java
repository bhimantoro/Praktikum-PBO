package TugasRumah;


class Civitas {
    protected String nomorInduk;
    protected String namaDepan;
    protected String namaBelakang;

    public Civitas(
        String nomorInduk,
        String namaDepan,
        String namaBelakang
    )
    {
        this.nomorInduk = nomorInduk;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void setNomorInduk(String nomorInduk){
        this.nomorInduk = nomorInduk;
    }
    public void setNamaDepan(String namaDepan){
        this.namaDepan = namaDepan;
    }
    public void setNamaBelakang(String namaBelakang){
        this.namaBelakang = namaBelakang;
    }

    public String getNomorInduk(){
        return nomorInduk;
    }
    public String getNamaDepan(){
        return namaDepan;
    }
    public String getNamaBelakang(){
        return namaBelakang;
    }

    public void info(){
        System.out.println(nomorInduk);
        System.out.println(namaDepan);
        System.out.println(namaBelakang);
    }
}
