package TugasPraktikum1;

public class Dosen extends Orang {
    private int nip;

    public Dosen(String nama){
        super(nama);
    }
    public Dosen(String nama, int nip){
        super(nama);
        this.nip = nip;
    }
    public Dosen(String nama, int nip, int umur){
        super(nama);
        this.nip = nip;
        this.umur = umur;
    }
    public void Info(){
        System.out.println("Nama    : "+super.nama);
        System.out.println("NIP     : "+nip);
        System.out.println("Umur    : "+umur);
    }
}
