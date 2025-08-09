import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice04 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("gaurav", 0);
        map.put("Abhi", 100);
        map.put("Ramu", 1);
        map.put("Ashish", 2);
        map.put("Ayush", 3);
        Set<Map.Entry<String,Integer>> keyValueSet = map.entrySet();
        for (Map.Entry<String, Integer> entry : keyValueSet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------");
        map.remove("Ayush");
        map.remove("Ramu",2);
        map.remove("Ashish",2);
        map.replace("gaurav", 70);
        Set<Map.Entry<String,Integer>> keyValueSets = map.entrySet();
        for (Map.Entry<String, Integer> entry : keyValueSets) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
