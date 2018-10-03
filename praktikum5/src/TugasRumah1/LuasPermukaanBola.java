package TugasRumah1;

public class LuasPermukaanBola {
    private double phi = 3.14285714286;
    private double r;
    private double LP;

    public LuasPermukaanBola(){
        double phi;
        double r;
    }

    public void setR(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }

    private double setLP(double phi, double r){
        return 4*phi*(Math.pow(r,2));
    }
    public double getLP(){
        return setLP(phi, r);
    }
}
