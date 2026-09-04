package DAY3.SESSION1;
class Animal2{
    void makeSound(){
        System.out.println("");
    }
}
class Dog2 extends Animal2{
    @Override
    void makeSound(){
        System.out.println("Barks");
    }
    void skill(){
        System.out.println("The Dog is Playing with the ball");
    }
}
public class DowncastingPolymorphism {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        Dog2 d=(Dog2) a;
        d.skill();
        d.makeSound();
    }
}

