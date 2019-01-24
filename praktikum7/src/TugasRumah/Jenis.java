package TugasRumah;

public class Jenis extends Rental{
    public void ps2(){
        Rental ps2 = new Rental();
        ps2.sewa("Playstation 2", 1);
        ps2.sewa(2500);
        ps2.info();
    }
    public void ps3(){
        Rental ps3 = new Rental();
        ps3.sewa("Playstation 3", 2);
        ps3.sewa(3500);
        ps3.info();
    }
}
