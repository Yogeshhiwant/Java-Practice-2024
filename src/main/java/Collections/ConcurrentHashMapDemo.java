package Collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    // Concurrent version of HashMap --> ConcurrentHashMap
    // Java 7 --> segment based locking --> 16 segments(smaller HashMaps)
    // Only the segment being "written" or "read" from is locked
    // read: do not require locking unless there is a write operation is happening on the same segment
    // write : lock

    // Java 8 --> no segmentation
    //        --> Compare-And-Swap approach
    // Thread A last saw --> x = 45
    // Thread A work --> x to 50
    // if x is still 45, then change it to 50 else don't change and retry
    // put --> index



    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                map.put(i, "Thread 2");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final size of the map: " + map.size());
        
    }
}
