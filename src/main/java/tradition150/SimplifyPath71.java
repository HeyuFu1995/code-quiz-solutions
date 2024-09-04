package tradition150;

import java.util.Stack;

public class SimplifyPath71 {
    private class TestCase {
        static String path = "/.../a/../b/c/../d/./"
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param path
     * @return
     */
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        Stack<String> pathStack = new Stack<>();

        for(String dir: directories) {
            if(".".equals(dir) || dir.isEmpty()) {
                continue;
            }
            else if("..".equals(dir)) {
                if(!pathStack.isEmpty()) {
                    pathStack.pop();
                }
            }
            else {
                pathStack.push(dir);
            }
        }
        StringBuilder builder = new StringBuilder();
        while(!pathStack.isEmpty()) {
            builder.insert(0, pathStack.pop());
            builder.insert(0, "/");
        }
        return builder.isEmpty() ? "/" : builder.toString();
    }
}
