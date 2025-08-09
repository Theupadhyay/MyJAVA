import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Practice02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.putIfAbsent("One",11);
        map.putIfAbsent("Six", 6);
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for (Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        int value = map.get("One");
        System.out.println("The Value is : "+ value);
        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(9));
        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
        }
        Collection<Integer> valuee = map.values();
        for (Integer values : valuee){
            System.out.println(values);
        }
    }
}
