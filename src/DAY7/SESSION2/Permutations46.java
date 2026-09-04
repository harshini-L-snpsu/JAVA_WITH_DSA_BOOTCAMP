package DAY7.SESSION2;
import java.util.*;
public class Permutations46 {
    public static List<List<Integer>>permutations(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums, new ArrayList<>(), visited, result);
        return result;
    }
        public static void backtracking(int[] nums, List<Integer> current, boolean [] visited, List<List<Integer>> result){
            if(current.size()== nums.length){
                result.add(new ArrayList<>(current));
                return ;
            }
        //try all unsed
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            //choose
            current.add(nums[i]);
            backtracking(nums, current, visited, result);
            //unchoose
            current.remove(current.size()-1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = permutations(nums);
        System.out.println(list);
    }
    
}
