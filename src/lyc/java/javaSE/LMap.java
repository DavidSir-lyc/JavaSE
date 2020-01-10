package lyc.java.javaSE;

import java.util.HashMap;
import java.util.TreeMap;

public class LMap {
    /** HashMap 与 TreeMap 的常用方法一样*/
    void mapFun() {
        // HashMap
        HashMap hashMap = new HashMap();
        hashMap.put("name", "LYC");
        hashMap.put("age", "30");
        hashMap.put("sex", "male");
        System.out.println(hashMap.get("name"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());

        // TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("name", "YL");
        treeMap.put("age", "29");
        treeMap.put("sex", "male");
        // 遍历Map中所有的的value值
        for (String val : treeMap.values()) {
            System.out.println(val);
        }
        // 遍历Map
        for (String key : treeMap.keySet()) {
            System.out.println(treeMap.get(key));
        }
    }
}
