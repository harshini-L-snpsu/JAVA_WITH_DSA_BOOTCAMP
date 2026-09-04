package DAY12.SESSION2;
import java.util.*;

public class KeysAndRooms {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int room = queue.poll();

            for (int key : rooms.get(room)) {

                if (!visited[key]) {
                    visited[key] = true;
                    queue.add(key);
                }
            }
        }

        for (boolean room : visited) {
            if (!room) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rooms: ");
        int n = sc.nextInt();

        List<List<Integer>> rooms = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter number of keys in room " + i + ": ");
            int k = sc.nextInt();

            List<Integer> keys = new ArrayList<>();

            for (int j = 0; j < k; j++) {
                keys.add(sc.nextInt());
            }

            rooms.add(keys);
        }

        boolean result = canVisitAllRooms(rooms);

        System.out.println("Can visit all rooms: " + result);

        sc.close();
    }
}