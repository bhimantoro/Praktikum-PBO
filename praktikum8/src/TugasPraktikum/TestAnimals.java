package TugasPraktikum;

public class TestAnimals {
    public static void main(String[] args){
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

//        demonstrate different implementations of an interface
        f.play();
        c.play();

//        demonstract virtual method invocation
        e.eat();
        e.walk();

//        demonstrate calling super methods
        a.walk();
    }
}
