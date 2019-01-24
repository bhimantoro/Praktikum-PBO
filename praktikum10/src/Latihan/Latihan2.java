package Latihan;
import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        Set s = new HashSet();
        String kalimat = "I came I know she know me left";
        String[] kata = kalimat.split(" ");
        for (int i=0; i<kata.length; i++)
            if (!s.add(kata[i]))
                System.out.println("Duplicate detected: " + kata[i]);
        System.out.println(s.size() + " distinct words : "+s);
    }
}
