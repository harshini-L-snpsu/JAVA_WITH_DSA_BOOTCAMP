package DAY10.SESSION1;
import java.util.Stack;
import java.util.Arrays;

public class NextGreaterII {
    public static int[] nextGreat(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int current = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                int index = stack.pop();
                result[index] = current;
            }
            stack.push(i % n);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreat(nums);
        System.out.println(Arrays.toString(result));
    }
}
