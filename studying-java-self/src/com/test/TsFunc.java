package com.test;
import com.entity.*;
import com.collection.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TsFunc {
    public static void testArrayListClass() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello", 0);
        list.add("World", 1);
        list.add("Java", 2);
        System.out.println(list);
    }
}
