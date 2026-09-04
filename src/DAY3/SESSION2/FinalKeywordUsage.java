package DAY3.SESSION2;
class Wallet{
    final int capacity = 100;
    final void display(){
        System.out.println(capacity);
    }
}
//class payment extends Wallet{
//void display(){

//}
//}
public class FinalKeywordUsage {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        //w.capacity = 200;(cannot change)
System.out.println(w.capacity);
    }
    
}
