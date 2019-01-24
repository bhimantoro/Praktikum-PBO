package TugasRumah;

class Universitas extends Civitas{
    protected String unitKerja;
    protected String bagian;

    public Universitas(
        String nomorInduk,
        String namaDepan,
        String namaBelakang,
        String unitKerja,
        String bagian
    )
    {
        super(nomorInduk, namaDepan, namaBelakang);
        this.unitKerja = unitKerja;
        this.bagian = bagian;
    }

    public void setUnitKerja(String unitKerja){
        this.unitKerja = unitKerja;
    }
    public void setBagian(String bagian){
        this.bagian = bagian;
    }

    public String getUnitKerja(){
        return unitKerja;
    }
    public String getBagian(){
        return bagian;
    }

    @Override
    public void info(){
        System.out.println("============================");
        System.out.println("Nomor Induk    : "+super.getNomorInduk());
        System.out.println("Nama           : "+super.getNamaDepan().concat(" "+super.getNamaBelakang()));
        System.out.println("Unit Kerja     : "+unitKerja);
        System.out.println("Bagian         : "+bagian);
        System.out.println("============================");
    }
}
