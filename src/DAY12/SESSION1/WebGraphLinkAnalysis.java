package DAY12.SESSION1;
import java.util.Scanner;

public class WebGraphLinkAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int x = sc.nextInt();

                if (x == 1) {
                    count++;
                }
            }
        }

        System.out.println("Number of web pages: " + n);
        System.out.println("Number of Hyperlinks: " + count);

        sc.close();
    }
}