package tradition150;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache23 extends LinkedHashMap<Integer, Integer>{

    int capacity;

    private class TestCase {
    }

    public static void solution() {

    }


    /**
     * Solution
     * Using JDK LinkedHashMap
     * Time Complexity:O(n)
     * @param capacity
     */
    public LRUCache23(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
