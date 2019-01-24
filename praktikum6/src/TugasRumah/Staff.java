package TugasRumah;

class Staff extends Fakultas{
    protected String jabatan;
    protected String status;
    protected String golongan;

    public Staff(
        String nomorInduk,
        String namaDepan,
        String namaBelakang,
        String jurusan,
        String fakultas,
        String jabatan,
        String status,
        String golongan
    )
    {
        super(nomorInduk, namaDepan, namaBelakang, jurusan, fakultas);
        this.jabatan = jabatan;
        this.status = status;
        this.golongan = golongan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }

    public String getJabatan(){
        return jabatan;
    }
    public String getStatus(){
        return status;
    }
    public String getGolongan(){
        return golongan;
    }

    @Override
    public void info(){
        System.out.println("============================");
        System.out.println("Nomor Induk    : "+super.getNomorInduk());
        System.out.println("Nama           : "+super.getNamaDepan().concat(" "+super.getNamaBelakang()));
        System.out.println("Jurusan        : "+super.getJurusan());
        System.out.println("Fakultas       : "+super.getFakultas());
        System.out.println("Jabatan        : "+jabatan);
        System.out.println("Status         : "+status);
        System.out.println("Golongan       : "+golongan);
        System.out.println("============================");
    }
}
