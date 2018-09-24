package Latihan1;

/**
 * @author suryo
 */
public class TesMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(1234, "Udin", "TE", true);
        Mahasiswa mhs2 = new Mahasiswa(1212, "Umam", "TS", false);
        Mahasiswa mhs3 = new Mahasiswa(1313, "Bejo", "TM", true);

        System.out.println("Mahasiswa dengan NIM " + mhs1.nim + " dengan nama " + mhs1.nama +/*latihan1e*/" jurusan " + mhs1.jurusan +/*latihan1e*/" memliki status aktif = " + mhs1.status_aktif);
        System.out.println("Mahasiswa dengan NIM " + mhs2.nim + " dengan nama " + mhs2.nama +/*latihan1e*/" jurusan " + mhs2.jurusan +/*latihan1e*/" memliki status aktif = " + mhs2.status_aktif);
        System.out.println("Mahasiswa dengan NIM " + mhs3.nim + " dengan nama " + mhs3.nama +/*latihan1e*/" jurusan " + mhs3.jurusan/*latihan1e*/ + " memliki status aktif = " + mhs3.status_aktif);

        mhs1.cetakMhs(); //soal e
        mhs2.cetakMhs();
        mhs3.cetakMhs();
    }
}