package DAY3.SESSION2;
interface Animal3{
    final int num = 10;
    default void eat(){
    }
    void sleep();
}
class Monkey implements Animal3{

    public void eat(){
        System.out.println("Monkey eats banana");
    }
    public void sleep(){
        System.out.println("Monkey sleeps on the Tree");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        
    }
}
