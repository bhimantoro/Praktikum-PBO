/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author suryo
 */
public class Mahasiswa {
    public int nim;
    public boolean status_aktif;
    String nama, jurusan;
    public Mahasiswa(int i, String n, String j, boolean status){
    	nim = i;
        nama = n; //latihan1d
        jurusan = j; //latihan1d
    	status_aktif = status;
    }
    //soal e
    public void cetakMhs(){
        System.out.print(nim);
        System.out.print(nama);
        System.out.print(jurusan);
        System.out.println(status_aktif);
    }
}
