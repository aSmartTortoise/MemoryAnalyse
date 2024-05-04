package com.wyj.matmemory;

public class SameContentWrapperContainerProxy {
    SameContentWrapperContainer sameContentWrapperContainer;

    public SameContentWrapperContainerProxy() {
        SameContentWrapperContainer container = new SameContentWrapperContainer();
        container.init();
        sameContentWrapperContainer = container;
    }

}
