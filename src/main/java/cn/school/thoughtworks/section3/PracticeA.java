package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = object.get("value");
        for (String s : collectionA.keySet()) {
            if (list2.contains(s)) {
                int count = collectionA.get(s) - 1;
                collectionA.put(s, count);
            }
        }
        return collectionA;
    }
}
