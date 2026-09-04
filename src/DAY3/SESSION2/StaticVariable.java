package DAY3.SESSION2;
//import jdk.dynalink.beans.StaticClass
class Bank{
    
    //Static variable
    
    static int count = 0;
    static String appname;

    //Static blocks
    static {
        appname = "Bank App";
    }
static void printCount(){
    System.out.println("Static Method");
}
}
public class StaticVariable {
    public static void main(String[] args) {
        
    }
    public static int main(){
        return 1;
    }
}