package 制作电子词典;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("apple", "苹果");
        map.put("banana", "香蕉");
        map.put("water", "水");
        System.out.println("请输入你要查询的单词:");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String newWord = sc.nextLine();
            if(map.get(newWord) == null) {
                System.out.println("不存在!");
            } else {
                System.out.println(map.get(newWord));
            }
        }
    }
}
