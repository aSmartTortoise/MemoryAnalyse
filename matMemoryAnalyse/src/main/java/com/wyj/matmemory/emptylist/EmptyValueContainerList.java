package com.wyj.matmemory.emptylist;

import java.util.ArrayList;
import java.util.List;

public class EmptyValueContainerList {
    List<EmptyValueContainer> list = new ArrayList(500 * 1000);

    public EmptyValueContainerList() {
        for (int i = 0; i < 500 * 1000; i++) {
            list.add(new EmptyValueContainer());
        }
    }

}
