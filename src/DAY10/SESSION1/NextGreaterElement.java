package DAY10.SESSION1;
import java.util.Stack;
import java.util.Arrays;
public class NextGreaterElement {
    public static int[] nextGreat(int[] nums){
        int n= nums.length;
        int[] result= new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                int index = stack.pop();
                result[index]=nums[i];
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreat(nums);
        System.out.println(Arrays.toString(result));
    }
    
}
