package bai4.bai4_6;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    public String toString(){
        return "Mammal["+super.toString()+"]";
    }
}
