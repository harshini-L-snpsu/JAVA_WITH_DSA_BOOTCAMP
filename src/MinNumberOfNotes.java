public class MinNumberOfNotes {public static void main(String[] cmd){
        int N=242; 
        int c100=N/100;
        N=N%100;

    int c50=N/50;
    N=N%50;

    int c20=N/20;
    N=N%20;

    int c10=N/10;
    N=N%10;

    int c5=N/5;
    N=N%5;

    int c2=N/2;
    N=N%2;

    int c1=N/1;
    N=N%1;

    int result=c100+c50+c20+c10+c5+c2+c1;
    System.out.println(result);

    }
}
