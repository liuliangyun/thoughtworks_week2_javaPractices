package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String str = collection1.get(i);
            if (result.containsKey(str)) {
                int count = result.get(str);
                count++;
                result.put(str, count);
            } else {
                result.put(str,1);
            }
        }
        return result;
    }
}
