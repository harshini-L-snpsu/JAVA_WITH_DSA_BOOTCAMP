package DAY2.SESSION3;
public class NonParam{
    String title;
    int price;
    public NonParam(){
        title = "Java";
        price = 500;
    }
    public void greet(){
        System.out.println("Hello");
    }
    public static void main(String[]args){
        NonParam n = new NonParam();
        System.out.println("Title:" + n.title +  "Price:" + n.price);
         n.greet();
    }
}
