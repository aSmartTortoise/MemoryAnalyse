package com.wyj.matmemory.emptylist;

import java.util.ArrayList;
import java.util.List;

public class FilledValueContainerList {
    List<FilledValueContainer> list = new ArrayList(500);

    public FilledValueContainerList() {
        for (int i = 0; i < 500; i++) {
            list.add(new FilledValueContainer().init());
        }
    }

}
