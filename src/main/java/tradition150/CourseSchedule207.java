package tradition150;

import java.util.*;

public class CourseSchedule207 {
    private class TestCase {
        static int numCourses = 2;
        static int[][] prerequisites = {{1,0}};
    }

    public static void main(String[] args) {
         new CourseSchedule207().canFinish(TestCase.numCourses, TestCase.prerequisites);
    }

    /**
     * Solution 1
     * Time Complexity: O(n2)
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> preMap = new HashMap<>();
        Map<Integer, Set<Integer>> postMap = new HashMap<>();
        int[] courseVisited = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            preMap.put(i, new HashSet<>());
            postMap.put(i, new HashSet<>());
            courseVisited[i] = 0;
        }
        for(int[] prerequisite: prerequisites) {
            preMap.get(prerequisite[0]).add(prerequisite[1]);
            postMap.get(prerequisite[1]).add(prerequisite[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(preMap.get(i).isEmpty()) {
                queue.offer(i);
                courseVisited[i] = 1;
            }
        }

        while(!queue.isEmpty()) {
            int node = queue.poll();
            Set<Integer> postSet = postMap.get(node);
            for(int postNode: postSet) {
                preMap.get(postNode).remove(node);
            }
            for(int i = 0; i < numCourses; i++) {
                if(preMap.get(i).isEmpty() && courseVisited[i] == 0) {
                    queue.offer(i);
                    courseVisited[i] = 1;
                }
            }
        }

        for(int i: courseVisited) {
            if(i == 0) {
                return false;
            }
        }

        return true;

    }
}
