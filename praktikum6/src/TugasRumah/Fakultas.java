package TugasRumah;

class Fakultas extends Civitas {
    protected String jurusan;
    protected String fakultas;

    public Fakultas(
        String nomorInduk,
        String namaDepan,
        String namaBelakang,
        String jurusan,
        String fakultas
    )
    {
        super(nomorInduk, namaDepan, namaBelakang);
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    public String getJurusan(){
        return jurusan;
    }
    public String getFakultas(){
        return fakultas;
    }

    @Override
    public void info(){
        System.out.println(jurusan);
        System.out.println(fakultas);
    }
}
