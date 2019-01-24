package Latihan4;

public class NegativeNumberException extends Exception{
    private int bilangan;
//    default constructor
    NegativeNumberException(){}
//    constructor dengan parameter bertipe string dan int
public NegativeNumberException(String pesan){
        super(pesan);
    }
    NegativeNumberException(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}

