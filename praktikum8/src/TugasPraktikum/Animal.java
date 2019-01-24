package TugasPraktikum;

abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk() {
        System.out.println("Hewan ini berjalan dengan "+legs+" kaki");
    }
    public abstract void eat();
}
