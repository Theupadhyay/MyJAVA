

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Practice01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("-------------");
        HashMap<String, Integer> anoMap = new HashMap<>();
            anoMap.put("six",6);
            anoMap.put("seven",7);
            anoMap.putAll(map);
            entrySet = anoMap.entrySet();
            for (Entry<String,Integer> entry: entrySet){
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
    }
}
