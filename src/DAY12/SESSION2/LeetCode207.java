package DAY12.SESSION2;
import java.util.*;
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] preq) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int j = 0; j < numCourses; j++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] p : preq) {
            int course = p[0];
            int pre = p[1];

            graph.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int j = 0; j < numCourses; j++) {
            if (indegree[j] == 0) {
                q.offer(j);
            }
        }

        int count = 0;

        while (!q.isEmpty()) {

            int current = q.poll();
            count++;

            for (int i : graph.get(current)) {

                indegree[i]--;

                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        return count == numCourses;
    }
    public static void main(String[] args) {
        
    }
}

    
