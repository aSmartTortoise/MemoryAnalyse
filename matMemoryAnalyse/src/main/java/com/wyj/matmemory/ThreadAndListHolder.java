package com.wyj.matmemory;

import org.objectweb.asm.Opcodes;

public class ThreadAndListHolder extends ClassLoader implements Opcodes {
    private static Thread innerThread1;
    private static Thread innerThread2;
    private static final SameContentWrapperContainerProxy sameContentWrapperContainerProxy =
            new SameContentWrapperContainerProxy();

    static {
        // 启用两个线程作为 GC Roots
        innerThread1 = new Thread(new Runnable() {
            public void run() {
                SameContentWrapperContainerProxy proxy = sameContentWrapperContainerProxy;
                try {
                    Thread.sleep(60 * 60 * 1000);
                } catch (Exception e) {
                    System.exit(1);
                }
            }
        });
        innerThread1.setName("ThreadAndListHolder-thread-1");
        innerThread1.start();

        innerThread2 = new Thread(new Runnable() {
            public void run() {
                SameContentWrapperContainerProxy proxy = proxy = sameContentWrapperContainerProxy;
                try {
                    Thread.sleep(60 * 60 * 1000);
                } catch (Exception e) {
                    System.exit(1);
                }
            }
        });
        innerThread2.setName("ThreadAndListHolder-thread-2");
        innerThread2.start();
    }

}
