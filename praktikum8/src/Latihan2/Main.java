package Latihan2;

public class Main {
    public static void main(String[] args){
        Line x1 = new Line(1,2,3,4);
        Line x2 = new Line(2,3,4,5);
        Line x3 = new Line(3,4,5,6);
        System.out.println(x1.getLength());
        System.out.println(x1.isGreater(x1,x2));
        System.out.println(x1.isLess(x2,x3));
        System.out.println(x1.isEqual(x3,x1));
    }
}
