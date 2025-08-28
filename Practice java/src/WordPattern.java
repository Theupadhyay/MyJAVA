import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = word[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) {
                    return false;
                }
            }else {
                if(used.contains(w)){
                    return false;
                }
                map.put(c, w);
                used.add(w);
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
