package TugasRumah.MataKuliah;

public class Matakuliah {
    private String kode_makul;
    private int js_makul;
    private String dosen_makul;
    private int angkatanMhs;
    private int maksKapasitas = 40;
    private int jumlahMhs;
    private String password = "udin8888";

    public Matakuliah(String kode_makul,
                      int js_makul,
                      String dosen_makul,
                      int angkatanMhs,
                      int maksKapasitas) {
        this.kode_makul = kode_makul;
        this.js_makul = js_makul;
        this.dosen_makul = dosen_makul;
        this.angkatanMhs = angkatanMhs;
        this.maksKapasitas = maksKapasitas;
    }

    public Matakuliah(String kode_makul,
                      int js_makul,
                      String dosen_makul,
                      int angkatanMhs) {
        this.kode_makul = kode_makul;
        this.js_makul = js_makul;
        this.dosen_makul = dosen_makul;
        this.angkatanMhs = angkatanMhs;
    }

    public Matakuliah(String kode_makul,
                      int js_makul,
                      int angkatanMhs) {
        this.kode_makul = kode_makul;
        this.js_makul = js_makul;
        this.angkatanMhs = angkatanMhs;
    }

    public void cetak() {
        System.out.println("\n\nKode Matakuliah\t\t: " + kode_makul);
        System.out.println("Jam Studi\t\t\t: " + js_makul);
        System.out.println("Dosen Matakuliah\t: " + dosen_makul);
        System.out.println("Angkatan Mahasiswa\t: " + angkatanMhs);
        System.out.println("Maks Kapasitas\t\t: " + maksKapasitas);
        System.out.println("Jumlah Mahasiswa\t: " + jumlahMhs);
    }

    public String cekKodeMakul() {
        return kode_makul;
    }

    public boolean ubahKodeMakul(String kode_makul, String password) {
        if (password.equals(this.password)) {
            this.kode_makul = kode_makul;
            return true;
        }
        else {
            return false;
        }
    }

    public int cekJSMakul() {
        return js_makul;
    }

    public boolean ubahJSMakul(int js_makul, String password) {
        if (password.equals(this.password)) {
            if (js_makul <= 4) {
                this.js_makul = js_makul;
                return true;
            }
            else {
                System.out.println("JS Melebihi Batas Maksimal yaitu 4");
                return false;
            }
        }
        else {
            return false;
        }
    }

    public String cekDosenMakul() {
        return dosen_makul;
    }

    public boolean ubahDosenMakul(String dosen_makul, String password) {
        if (password.equals(this.password)) {
            this.dosen_makul = dosen_makul;
            return true;
        }
        else {
            return false;
        }
    }

    public int cekAngkatanMhs() {
        return angkatanMhs;
    }

    public boolean ubahAngkatanMhs(int angkatanMhs, String password) {
        if (password.equals(this.password)) {
            this.angkatanMhs = angkatanMhs;
            return true;
        }
        else {
            return false;
        }
    }

    public int cekMaksKapasitas() {
        return maksKapasitas;
    }

    public boolean ubahMaksKapasitas(int maksKapasitas, String password) {
        if (password.equals(this.password)) {
            if (maksKapasitas <= 60) {
                this.maksKapasitas = maksKapasitas;
                return true;
            }
            else {
                System.out.println("Melebihi Kapasitas");
                return false;
            }
        }
        else {
            return false;
        }
    }

    public int cekJumlahMhs() {
        return jumlahMhs;
    }

    public boolean tambahMhs(String nim, String password) {
        if (nim.length() == 12 & nim.matches("[0-9]+") & password.equals(this.password)) {
            if (jumlahMhs < maksKapasitas) {
                String subs = nim.substring(0, 2);
                int akt = Integer.parseInt(subs);
                if (2000 + akt <= angkatanMhs) {
                    jumlahMhs += 1;
                    System.out.println("Mahasiswa angkatan " + (2000 + akt) + " dengan NIM " + nim + " berhasil ditambahkan pada matakuliah dengan kode " + kode_makul);
                    return true;
                }
                else {
                    System.out.println("Angkatan tidak memenuhi syarat");
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            System.out.println("Format NIM / Password Salah");
            return false;
        }
    }
}