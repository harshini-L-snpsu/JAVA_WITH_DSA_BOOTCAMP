package DAY9.SESSION1;

public class Program1 {
    public static void main(String[] args) {
        String s1="Pooja";
        String s2="Pooja";
        String s3=new String("Pooja");
        System.out.println(s1==s2);//TRUE
        System.out.println(s2==s3);//False

        System.out.println(s1.equals(s2));//TRUE
        System.out.println(s1.equals(s3));//TRUE
    }
    
}
