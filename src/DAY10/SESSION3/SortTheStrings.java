package DAY10.SESSION3;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheStrings {
    public static String sortCharacter(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sortCharacter(str));
        sc.close();
    }
}
