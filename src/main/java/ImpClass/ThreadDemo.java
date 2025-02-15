package ImpClass;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Hashtable<Integer, String> map = new Hashtable<>();
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
