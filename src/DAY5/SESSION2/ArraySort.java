package DAY5.SESSION2;
import java.util.reflect.Arrays;
public class ArraySort {
    public int arrayPairFinding(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i< nums.length; i +=2){
            sum = sum +nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] = {1, 4, 3, 2};
        System.out.println(sum);
    }
    
}
