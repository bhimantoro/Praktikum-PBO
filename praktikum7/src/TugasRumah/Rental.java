package TugasRumah;

public class Rental {
    private String ps;
    private int nomer;
    private int harga;

    public void setPs(String ps){
        this.ps = ps;
    }

    public void setNomer(int nomer){
        this.nomer = nomer;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public String getPs(){
        return ps;
    }
    public int getNomer(){
        return nomer;
    }
    public int getHarga(){
        return harga;
    }

    public void sewa(String ps, int nomer){
        setPs(ps);
        setNomer(nomer);
    }
    public void sewa(int harga){
        setHarga(harga);
    }

    public void info(){
        System.out.println("Jenis PS\t\t: "+getPs());
        System.out.println("Nomer TV\t\t: "+getNomer());
        System.out.println("Harga per jam\t: "+getHarga());
    }
}
