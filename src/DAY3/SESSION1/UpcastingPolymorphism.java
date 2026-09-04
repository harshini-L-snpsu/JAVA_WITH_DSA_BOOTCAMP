package DAY3.SESSION1;
class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Barks");
    }
    void skill(){
        System.out.println("The Dog is Playing with the ball");
    }
}
public class UpcastingPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a.skill();//compile error Animal cannot ask dog
    }
}
}
