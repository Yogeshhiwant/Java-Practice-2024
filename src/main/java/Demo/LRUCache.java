package Demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.5f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> map = new LRUCache<>(3);
        map.put("Yogesh", 92);
        map.put("Ram", 91);
        map.put("Shyam", 76);
        map.put("Sanket", 16);


        System.out.println(map);
    }
}
