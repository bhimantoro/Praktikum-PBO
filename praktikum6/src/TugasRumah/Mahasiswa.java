package TugasRumah;

class Mahasiswa extends Fakultas{
    protected String programStudi;
    protected int angkatan;

    public Mahasiswa(
        String nomorInduk,
        String namaDepan,
        String namaBelakang,
        int angkatan,
        String programStudi,
        String jurusan,
        String fakultas
    )
    {
        super(nomorInduk, namaDepan, namaBelakang, jurusan, fakultas);
        this.angkatan = angkatan;
        this.programStudi = programStudi;
    }

    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }

    public String getProgramStudi(){
        return programStudi;
    }
    public int getAngkatan(){
        return angkatan;
    }


    @Override
    public void info(){
        System.out.println("============================");
        System.out.println("Nomor Induk    : "+super.getNomorInduk());
        System.out.println("Nama           : "+super.getNamaDepan().concat(" "+super.getNamaBelakang()));
        System.out.println("Angkatan       : "+angkatan);
        System.out.println("Program Studi  : "+programStudi);
        System.out.println("Jurusan        : "+super.getJurusan());
        System.out.println("Fakultas       : "+super.getFakultas());
        System.out.println("============================");
    }
}
