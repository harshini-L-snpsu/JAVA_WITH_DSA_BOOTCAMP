package DAY7.SESSION1;

import java.util.ArrayList;
import java.util.List;

public class BikeAndPath {
   static boolean findingPath(List<List<Integer>> maze, int x, int y, String path) {

    int N = maze.size();

    if (x >= N || y >= N) {
        return false;
    }

    if (maze.get(x).get(y) == 0) {
        return false;
    }

    if (x == N - 1 && y == N - 1) {
        System.out.println("Path: " + path);
        return true;
    }

    maze.get(x).set(y, 0);

    // Down
    if (findingPath(maze, x + 1, y, path + "D")) {
        return true;
    }

    // Right
    if (findingPath(maze, x, y + 1, path + "R")) {
        return true;
    }

    // Backtrack
    maze.get(x).set(y, 1);

    return false;
}
public static void main(String[] args) {

    int[][] matrix = {
        {1, 0, 0, 0},
        {1, 1, 0, 0},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };

    List<List<Integer>> maze = new ArrayList<>();

    for (int[] rows : matrix) {
        List<Integer> list = new ArrayList<>();

        for (int value : rows) {
            list.add(value);
        }

        maze.add(list);
    }

    boolean result = findingPath(maze, 0, 0, "");

    System.out.println("Path found: " + result);
    }
}