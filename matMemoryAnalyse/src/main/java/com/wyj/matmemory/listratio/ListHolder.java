package com.wyj.matmemory.listratio;

import java.util.ArrayList;
import java.util.List;

public class ListHolder {
    static final int LIST_SIZE = 100 * 1000;
    List<String> list1 = new ArrayList<>(LIST_SIZE); // 5%填充
    List<String> list2 = new ArrayList<>(LIST_SIZE); // 5%填充
    List<String> list3 = new ArrayList<>(LIST_SIZE); // 15%填充
    List<String> list4 = new ArrayList<>(LIST_SIZE); // 30%填充

    public ListHolder init() {
        for (int i = 0; i < LIST_SIZE; i++) {
            if (i < 0.05 * LIST_SIZE) {
                list1.add("" + i);
                list2.add("" + i);
            }
            if (i < 0.15 * LIST_SIZE) {
                list3.add("" + i);
            }
            if (i < 0.3 * LIST_SIZE) {
                list4.add("" + i);
            }
        }
        return this;
    }

}
