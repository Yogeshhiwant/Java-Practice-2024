package ImpClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectDemo {

    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();
//      obj.wait();

//      Object.class.  methods are important methods

//        System.out.println(ObjectDemo.class.isArray());
        int[] arr = new int[3];
        System.out.println(arr[4]);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(15);

    }
}
