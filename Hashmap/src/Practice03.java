import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice03 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("gaurav", 0);
        map.put("Abhi", 100);
        map.put("Ramu", 1);
        map.put("Ashish", 2);
        map.put("Ayush", 3);
//        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
        Set<Entry<String,Integer>> keyValueSet = map.entrySet();
        for (Entry<String, Integer> entry : keyValueSet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
