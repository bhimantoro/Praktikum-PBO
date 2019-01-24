package TugasPraktikum;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish(){
        super(0);
    }

    @Override
    public void eat(){
        System.out.println("memakan plankton");
    }

    public void walk(){
        System.out.println("\nIkan berenang");
    }

    public void setName(String nama){
        name = nama;
    }
    public String getName(){
        return name;
    }
    public void play(){
        setName("Hiu");
        System.out.println("\nNama ikan : "+getName());
        eat();
        super.walk();
    }
}
