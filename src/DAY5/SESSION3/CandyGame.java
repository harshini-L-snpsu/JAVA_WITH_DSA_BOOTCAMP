package DAY5.SESSION3;

public class CandyGame {
public static int candy(int[] ratings){
    if ratings.lengthC


    //left to right
    for(int i=1;i<ratings.length;i++){
        if(ratings[i]>ratings[i-1]){
            candies[i]=candies[i-1]+1;
        }
    //right to left
    for(int i= ratings.length - 2; i>=0; i++){
        candies[i]=candies[i+1] + 1;
    }
    int total = 0;
    for(int c : candies){
        total+= c;
    }
    return total
    }
    }
    public static void main(String[] args) {
        
    }
    
}
