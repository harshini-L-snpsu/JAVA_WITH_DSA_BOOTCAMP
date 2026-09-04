package DAY5.SESSION2;

public class LeetCode1011 {
    public static int shipWithinDays(int[] weights,int days){
        int left = 0;
        int right = 0;
        for(int w :weights){
            left = Math.max(left, w);//10
            right +=w;//55
        }
        int answer = right;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(canShip(weights,days, mid)){
                answer = mid;
                right= mid - 1;
            }else{
                left= mid + 1;
            }
        }
        return answer;
}
public static boolean canShip(int[] weights,int days,int capacity){
    int coveredDays = 1;
    int currentLoad = 0;
    for(int w: weights){
        if(currentLoad + w > capacity){
            coveredDays++;
            currentLoad= 0;
        }
        currentLoad += w;
    }
    return coveredDays <= days;
}
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int days= 5;
    }
}