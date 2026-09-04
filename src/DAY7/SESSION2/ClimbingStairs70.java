package DAY7.SESSION2;
import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs70 {
    public static int climb(int n){
        if(n==0||n==1){
            return 1;
        }
        List<Integer> dp=new ArrayList<>();

        dp.set(0,1);
        dp.set(1,1);
        for(int i=2;i<=n;i++){
            int current = dp.get(i-1)+dp.get(i-2);
            dp.set(i,current);
        }
        return dp.get(n);
    }
    public static void main(String[] args) {
        System.out.println(climb(4));
    }
    
}
