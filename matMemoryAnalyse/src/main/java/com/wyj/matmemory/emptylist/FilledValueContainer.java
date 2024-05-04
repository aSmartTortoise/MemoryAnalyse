package com.wyj.matmemory.emptylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilledValueContainer {
    List<Integer> value1 = new ArrayList(10);
    List<Integer> value2 = new ArrayList(10);
    List<Integer> value3 = new ArrayList(10);

    public FilledValueContainer init() {
        value1.addAll(Arrays.asList(1, 3, 5, 7, 9));
        value2.addAll(Arrays.asList(2, 4, 6, 8, 10));
        value1.addAll(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        return this;
    }
}
