package bilet2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> reverse(Map map){
        Map<String, Integer> result = new HashMap<>();
        for (Object key: map.keySet()) {
            result.put((String) map.get(key), (int) key);
        }
        return result;
    }


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "BCD");
        map.put(3, "CDE");
        map.put(4, "CDE");
        System.out.println(map);
        System.out.println(reverse(map));

    }
}
