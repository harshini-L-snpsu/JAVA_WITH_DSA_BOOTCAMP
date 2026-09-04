package DAY9;
import java.util.*;
public class QueueManipulation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Array values 1 to 5
        int[] arr = {1, 2, 3, 4, 5};

        // Add array to queue
        for (int x : arr) {
            q.add(x);
        }

        System.out.println(q);

        // Take first 3 and add them back
        for (int i = 0; i < 3; i++) {
            q.add(q.remove());
        }
        System.out.println(q);

        // Again take first 3 and add them back
        for (int i = 0; i < 3; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
