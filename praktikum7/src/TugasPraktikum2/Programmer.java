package TugasPraktikum2;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    public int infoGaji(){
        return super.gaji;
    }
    public int infoBonus(){
        return bonus;
    }
}
