package DAY1.SESSION2.SESSION3;

public class DiffOfLF {
    public static void main (String[] args){
        int n =12345;
        int last = n % 10;

        int first = n;
        while (first >=10){
            first = first / 10;
    }
        int result = first - last;
        System.out.println("Difference:"+result);
}
}
