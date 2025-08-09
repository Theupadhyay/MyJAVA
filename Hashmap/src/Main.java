import java.util.HashMap;

public class Main {
    static void Hashing(String str){
        HashMap<Character , Integer>map = new HashMap<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
Hashing("jshdjdhdjdh");
    }
}