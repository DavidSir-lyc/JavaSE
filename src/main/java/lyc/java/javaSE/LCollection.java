package lyc.java.javaSE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

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
    void hashSetFun() {
        /**
         * HashSet不保证顺序,没有单独取出元素的内置方法
         * */
        HashSet hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("D");
        System.out.println(hashSet);
        hashSet.remove("D");
        System.out.println(hashSet.contains("D"));
        hashSet.clear();
        System.out.println(hashSet);
    }
    void treeSetFun() {
        /**
         * TreeSet 类实现的 Set 接口默认情况下是升序排序。
         * */
        TreeSet treeSet = new TreeSet<String>();
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");

        System.out.println(treeSet);
        System.out.println(treeSet);
        treeSet.remove("D");
        System.out.println(treeSet.contains("D"));
        treeSet.clear();
        System.out.println(treeSet);
    }
}
