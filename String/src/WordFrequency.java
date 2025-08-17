import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java is fun and java is powerful";
        String[] word = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : word) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);

    }
}
