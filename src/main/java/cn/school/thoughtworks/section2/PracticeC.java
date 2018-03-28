package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String str = collection1.get(i);
//          首先判断是否为单个元素，如果是，则直接更新元素数量
            if (str.length() == 1) {
                if (result.containsKey(str)) {
                    int count = result.get(str) + 1;
                    result.put(str, count);
                } else {
                    result.put(str, 1);
                }
            }
//          否则，解析字符串，读取元素数量后再更新
            else {
                String s = str.substring(0, 1);
                int count = 0;
//              如果已包含元素，则更新数量
                if (result.containsKey(s)) {
//                  如果字符串第二位为【，则数量在【 】之间
                    if (str.substring(1,2).equals("[")) {
                        int index = str.indexOf("]");
                        count = Integer.parseInt(str.substring(2, index));
                    }
//                  否则数量在连接符之后
                    else {
                        count = Integer.parseInt(str.substring(2, str.length()));
                    }
                    count += result.get(s);
                    result.put(s, count);
                }
//              如果不包含元素，则将此元素添加到结果列表中
                else {
                    if (str.substring(1,2).equals("[")) {
                        int index = str.indexOf("]");
                        count = Integer.parseInt(str.substring(2, index));
                    }
//                  否则数量在连接符之后
                    else {
                        count = Integer.parseInt(str.substring(2, str.length()));
                    }
                    result.put(s, count);
                }
            }
        }
        return result;
    }
}
