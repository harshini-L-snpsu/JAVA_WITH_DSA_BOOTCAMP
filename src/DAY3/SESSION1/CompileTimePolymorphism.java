package DAY3.SESSION1;
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 10));
        System.out.println(c.add(10.5, 20.6));
        System.out.println(c.add(10, 10 ,10));

    }
}
