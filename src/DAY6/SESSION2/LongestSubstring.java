package DAY6.SESSION2;
import java.util.Set;
import java.util.HashSet;
    public class LongestSubstring{
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new  HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            while(set.contains(current))
                set.remove(s.charAt(left));
            left++;
        }
        set.add(current);
        maxlen = Math.max(maxlen, right - left+1);
    }
    return maxlen;
}
public class LongestSubstring {
    public static void main(String[] args) {
        String s= "abcabcbb";
        System.out.println(maxlen);
    }
    
}
