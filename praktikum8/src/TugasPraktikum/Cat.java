package TugasPraktikum;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }

    public String getName(){
        return name;
    }
    public void setName(String nama){
        name=nama;
    }
    public void play(){
        System.out.println("\nNama Kucing : "+getName());
        eat();
        walk();
    }

    @Override
    public void eat(){
        System.out.println("memakan ikan");
    }
}
