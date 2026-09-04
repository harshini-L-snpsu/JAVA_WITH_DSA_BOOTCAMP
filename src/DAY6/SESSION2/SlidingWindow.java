package DAY6.SESSION2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
    public static int longestWindow(List<Integer> days,int k){
        int left = 0;
        int maxlength = 0;
        for(int right = 0; right<days.size(); right++){
            if(days.get(right)-days.get(left > k)){
                left++;
            }
            maxlength= Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
    public static void main(String[] args) {
    //int [] days = {1,3,5,7,9};
    List<Integer> days = new ArrayList<>();
    days = Arrays.asList(1,3,5,7,9);
    int k=4;
    }
}
