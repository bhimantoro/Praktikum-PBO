package Latihan2;

public class Line implements Relation {
    private double x1, x2, y1, y2;

    public Line(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength(){
        double length = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return length;
    }

    public boolean isGreater(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen>bLen);
    }
    public boolean isLess(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen<bLen);
    }
    public boolean isEqual(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen==bLen);
    }
}
