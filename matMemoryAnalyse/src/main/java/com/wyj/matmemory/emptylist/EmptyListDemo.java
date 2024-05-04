package com.wyj.matmemory.emptylist;

import java.lang.management.ManagementFactory;

public class EmptyListDemo {
    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("name:" + name);
        String pid = name.split("@")[0];
        System.out.println("pid:" + pid);
        EmptyValueContainerList emptyValueContainerList = new EmptyValueContainerList();
        FilledValueContainerList filledValueContainerList = new FilledValueContainerList();
        System.out.println("start sleep...");
        try {
            Thread.sleep(50 * 1000 * 1000);
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
