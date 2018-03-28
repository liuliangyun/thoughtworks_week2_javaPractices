package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = object.get("value");
        Map<String, Integer> result = new HashMap<>();
//      统计collectionA中元素出现次数
        for (int i = 0; i < collectionA.size(); i++) {
            String str = collectionA.get(i);
//          如果为单个元素，则直接更新元素数量
            if (str.length() == 1) {
                int count = 1;
                if (result.containsKey(str)) {
                    count = result.get(str) + 1;
                }
                result.put(str, count);
            }
//          否则解析字符串，得到元素数目再更新
            else {
                String s = str.substring(0, 1);
                int count = Integer.parseInt(str.substring(2, str.length()));
                result.put(s, count);
            }
        }
//      将result集合中list2包含的元素的出现次数满3减1
        for (String s : result.keySet()) {
            if (list2.contains(s)) {
                int count = result.get(s);
                int num = count - count / 3;
                result.put(s, num);
            }
        }
        return result;
    }
}
