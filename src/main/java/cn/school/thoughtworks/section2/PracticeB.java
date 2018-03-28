package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String str = collection1.get(i);
//            判断是否为单个元素，如果是直接更新数量
            if (str.length() == 1) {
                if (result.containsKey(str)) {
                    int count = result.get(str);
                    count++;
                    result.put(str, count);
                } else {
                    result.put(str, 1);
                }
            }
//            如果不是单个元素，需要解析元素数量再更新
            else {
                String s = str.substring(0,1);
                int count = Integer.parseInt(str.substring(str.length() - 1, str.length()));
                if (result.containsKey(s)) {
                    count += result.get(s);
                }
                result.put(s, count);
            }
        }
        return result;
    }
}
