package com.test;
import com.entity.*;
import com.collection.*;

public class TsFunc {
    public static void testArrayListClass() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 19; i++) {
            list.add("Hello" + i, i);
        }
        System.out.println(list.toString());
        for (int i =0 ; i < 5; i++) {
            list.remove(i);
        }
        System.out.println(list.toString());
    }

    public static void testLinkedListClass() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10, 0);
        list.add(30, 0);
        list.add(20, 1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
