package DAY3.SESSION1;
class Animal{
    void makeSound(){
        System.out.println("Barks");
    }
}
class cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}
class Elephant extends Animal{
    @Override
    void makeSound(){
        System.out.println("Trumpets");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {

    }
}
