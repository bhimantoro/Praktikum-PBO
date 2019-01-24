package TugasPraktikum;

class Sepeda extends Kendaraan{
    protected int jmlSadel;
    protected int jmlGir;

    public void setJmlSadel(int jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    public int getJmlSadel(){
        return jmlSadel;
    }

    public void setJmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }

    public Sepeda(
            int jmlRoda,
            String warna,
            int jmlSadel,
            int jmlGir
    ){
        super.jmlRoda = jmlRoda;
        super.warna = warna;
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    public void cetak(){
        System.out.println("Jumlah Roda  : "+jmlRoda);
        System.out.println("Warna        : "+warna);
        System.out.println("Jumlah Sadel : "+jmlSadel);
        System.out.println("Jumlah Gir   : "+jmlGir);
    }
}
