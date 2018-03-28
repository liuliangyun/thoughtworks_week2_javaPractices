package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = object.get("value");
        for (String s : collectionA.keySet()) {
            if (list2.contains(s)) {
                int count = collectionA.get(s);
                int num = count - count / 3;
                collectionA.put(s, num);
            }
        }
        return collectionA;
    }
}
