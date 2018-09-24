package Latihan1;
import java.util.Scanner;
public class dataMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Operasi array 1 dimensi
        String thead[] = {"NIM", "NAMA", "FAKULTAS", "JURUSAN", "PRODI"};

        //operasi array 2 dimensi
        String mahasiswa[][] = {
                {"160535611827","BUDI","FT","ELEKTRO","TEKNIK INFORMATIKA"},
                {"160535611828","TUTI","FT","SIPIL","TEKNIK SIPIL"},
                {"160535611829","FIRMAN","FMIPA","MATEMATIKA","PENDIDIKAN MATEMATIKA"},
                {"160535611830","EKO","FS","SENI","DESAIN KOMUNIKASI VISUAL"},
                {"160535611831","TINA","FE","AKUNTANSI","PENDIDIKAN AKUNTANSI"},
                {"160535611832","IRA","FMIPA","MATEMATIKA","MATEMATIKA"},
        };

        for (int i=0;i<mahasiswa.length; i++){
            System.out.println((i+1)+". "+mahasiswa[i][0]+"\t"+mahasiswa[i][1]);
        }
        System.out.println("\nMasukkan Nomor Urut = ");
        int choose = input.nextInt();

        System.out.println("\nDATA DIRI MAHASISWA");
        for (int i=0; i<mahasiswa[choose-1].length; i++){
            System.out.println(thead[i]+" : "+mahasiswa[choose-1][i]);
        }
    }
}
