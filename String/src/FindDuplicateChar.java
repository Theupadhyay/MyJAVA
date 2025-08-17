import java.util.HashMap;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String str = "Programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1){
                
                System.out.println(c + " comes these many times : "+ map.get(c));
            }
        }
    }
}
