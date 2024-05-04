package com.wyj.matmemory;

import java.util.ArrayList;

public class SameContentWrapperContainer {
    // 2个Wrapper内部指向同一个 ArrayList，方便学习 Dominator tree
    IntArrayListWrapper intArrayListWrapper1;
    IntArrayListWrapper intArrayListWrapper2;

    public void init() {
        // 线程直接支配 arrayList，两个 IntArrayListWrapper 均不支配 arrayList，只能线程运行完回收
        ArrayList<Integer> arrayList = generateSeqIntList(10 * 1000 * 1000, 0);
        intArrayListWrapper1 = new IntArrayListWrapper(arrayList, "IntArrayListWrapper-1");
        intArrayListWrapper2 = new IntArrayListWrapper(arrayList, "IntArrayListWrapper-2");
    }

    private static ArrayList<Integer> generateSeqIntList(int size, int startValue) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = startValue; i < startValue + size; i++) {
            list.add(i);
        }
        return list;
    }

}
