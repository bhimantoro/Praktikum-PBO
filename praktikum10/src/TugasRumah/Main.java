package TugasRumah;

import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1  = new Mahasiswa();
        mhs1.nim        = "170535629500";
        mhs1.nama       = "Bagong";
        mhs1.fakultas   = "FK";

        Mahasiswa mhs2  = new Mahasiswa();
        mhs2.nim        = "170535629400";
        mhs2.nama       = "Jaya";
        mhs2.fakultas   = "FIB";

        Mahasiswa mhs3  = new Mahasiswa();
        mhs3.nim        = "170535629499";
        mhs3.nama       = "Sugeng";
        mhs3.fakultas   = "FEB";

        Mahasiswa mhs4  = new Mahasiswa();
        mhs4.nim        = "170535629700";
        mhs4.nama       = "Restu";
        mhs4.fakultas   = "FISH";

        List<Mahasiswa> list = new ArrayList<Mahasiswa>();
        list.add(mhs1);
        list.add(mhs2);
        list.add(mhs3);
        list.add(mhs4);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Mahasiswa mahasiswa = (Mahasiswa) iterator.next();
            System.out.println("NIM\t\t\t= "+mahasiswa.nim);
            System.out.println("Nama\t\t= "+mahasiswa.nama);
            System.out.println("Fakultas\t= "+mahasiswa.fakultas);
        }
    }
}
