package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = collection2.get("value");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            String num = collection1.get(i);
            if (list2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
