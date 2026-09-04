package DAY3.SESSION2;
abstract class Bank2{
    String name;
    double balance;

    public Bank2(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    //Abstract method
    abstract void display();

    //Concrete Method
    void deposit(double amount){
        balance += amount;
        System.out.println(name +" " + balance);
    }
}
class Savings extends Bank2{
    public Savings(String name,double balance){
        super("Harshini",1000);
    }
    @Override
    void display(){
        System.out.println(balance);
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        //Bank b = new Bank();
        Bank2 b = new Savings ("Harshini",1000);
        System.out.println(b.name+":"+b.balance);
    }
}
