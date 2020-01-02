package com.lyc.javaPjt;

import java.util.ArrayList;
import java.util.LinkedList;

public class LCollection {
    /**
     * collection: List Set Queue
     * list ---> ArrayList, LinkedList
     * ArrayList：基于索引的访问方式，对尾部的增加和删除支持较好
     * LinkedList：便于向集合中插入或者删除元素。频繁向集合中插入和删除元素使用
    * */
    void arrayListFun() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("David");
        arrayList.add("Sir");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf("David"));
        System.out.println(arrayList.set(0, "My name is: ")); // 返回原来的元素
        System.out.println(arrayList.subList(0, 2)); // 返回截取到的list
    }
    void linkedListFun() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList);
    }
}
