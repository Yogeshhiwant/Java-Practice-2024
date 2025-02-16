package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);
        copyOnWriteArrayList.add(4);
        copyOnWriteArrayList.add(5);
        copyOnWriteArrayList.add(6);
        copyOnWriteArrayList.add(7);
        copyOnWriteArrayList.add(8);
        copyOnWriteArrayList.add(9);
        copyOnWriteArrayList.add(10);

        System.out.println(copyOnWriteArrayList);

        for (Integer i : copyOnWriteArrayList) {
            if (i % 2 == 0) {
                copyOnWriteArrayList.remove(i);
            }
        }
        System.out.println(copyOnWriteArrayList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//      List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0){
                integers.remove(next);
            }
        }
        System.out.println(integers);


        ListIterator<Integer> integerListIterator = integers.listIterator();

    }
}
