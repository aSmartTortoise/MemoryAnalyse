package com.wyj.matmemory.listratio;

public class ListRatioDemo {
    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    HolderContainer holderContainer1 = new HolderContainer();
                    try {
                        Thread.sleep(1000 * 1000 * 60);
                    } catch (Exception e) {
                        System.exit(1);
                    }
                }
            });
            thread.setName("inner-thread-" + i);
            thread.start();
        }
    }
}
