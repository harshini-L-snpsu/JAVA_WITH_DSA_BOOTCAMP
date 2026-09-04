package DAY7.SESSION2;

public class DecodeWays {

    public static int decode(String s){
        if(s.isEmpty()||s.charAt(0)=='0'){
            return 0;
        }
        int n = s.length();
        int[] dp= new int[s.length ()+ 1];
        //Initialization
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            //Single
            int singleDigit=s.charAt(i-1)-'0';
            if(singleDigit>=1&& singleDigit<=9){
                dp[i]=dp[i]+dp[i-1];
            }
            int doubleDigits=Integer.parseInt(s.substring(i-2,i));
            if(doubleDigits>=10 && doubleDigits <=26){
                dp[i] = dp[i] +dp[i-2];
            }
        }
         return dp[n];
    }
    public static void main(String[] args) {
        String s="226";
        System.out.println(decode(s));
    }
    
}
