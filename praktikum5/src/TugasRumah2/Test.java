package TugasRumah2;

public class Test {
    public static void main(String[] args) {
        int tmp;
        boolean status;
        Nasabah nasabah1 = new Nasabah("Udin", "PLN");
        nasabah1.setTabungan(new Tabungan(0));
        Nasabah nasabah2 = new Nasabah("Imam", "PDAM");
        nasabah2.setTabungan(new Tabungan(0));

        System.out.println("Nasabah 1 : "+nasabah1.toString());
        System.out.println("Nasabah 2 : "+nasabah2.toString());

        tmp = nasabah1.getTabungan().simpanUang(4000);
        System.out.println("\nNasabah 1 Menabung "+tmp);
        System.out.println("Saldo Nasabah 1 : "+nasabah1.getTabungan().getSaldo());
        tmp = nasabah2.getTabungan().simpanUang(7000);
        System.out.println("\nNasabah 2 Menabung "+tmp);
        System.out.println("Saldo Nasabah 2 : "+nasabah2.getTabungan().getSaldo());
        status = nasabah1.getTabungan().ambilUang(5000);
        System.out.println("\nNasabah 1 Mengambil Uang 5000");
        if (status){
            System.out.println("\nBerhasil Mengambil Uang 5000");
            System.out.println("Saldo Nasabah 1 : "+nasabah1.getTabungan().getSaldo());
        }
        else {
            System.out.println("Saldo Kurang");
            System.out.println("Saldo Nasabah 1 : "+nasabah1.getTabungan().getSaldo());
        }
        status = nasabah2.getTabungan().ambilUang(6000);
        System.out.println("\nNasabah 2 Mengambil Uang 6000");
        if (status){
            System.out.println("Berhasil Mengambil Uang 6000");
            System.out.println("Saldo Nasabah 2 : "+nasabah2.getTabungan().getSaldo());
        }
        else {
            System.out.println("\nSaldo Kurang");
            System.out.println("Saldo Nasabah 2 : "+nasabah2.getTabungan().getSaldo());
        }
        status = nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000);
        System.out.println("\nNasabah 2 Mentransfer 1000");
        if (status){
            System.out.println("Berhasil Transfer 1000");
        }
        else {
            System.out.println("\nSaldo Kurang");
        }
        System.out.println(
                "\nSaldo Nasabah 1 : "+nasabah1.getTabungan().getSaldo()+"\n" +
                "Saldo Nasabah 2 : "+nasabah2.getTabungan().getSaldo()
        );

    }
}
