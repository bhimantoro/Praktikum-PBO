package Latihan;
import java.util.*;

public class Latihan3 {
    public static void main(String[] args) {
        Set uniques = new HashSet();
        Set duplicates = new HashSet();
        String kalimat = "I came I know she know me left ";
        String[] kata = kalimat.split(" ");
        for (int i=0; i<kata.length; i++)
            if (!uniques.add(kata[i]))
                duplicates.add(kata[i]);

        uniques.removeAll(duplicates);

        System.out.println("Unique words: "+uniques);
    }
}
