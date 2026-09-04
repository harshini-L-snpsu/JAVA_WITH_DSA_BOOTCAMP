package DAY3.SESSION2;

public class Finally{
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
