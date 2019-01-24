package TugasRumah2;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }
    public int simpanUang(int jumlah){
        return saldo =+ jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (saldo>=jumlah){
            saldo -= jumlah;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean transfer(Tabungan t, int jumlah){
        if((saldo - jumlah) < 0) {
            return false;
        }
        else {
            this.saldo -= jumlah;
            t.saldo += jumlah;
            return true;
        }
    }
}
