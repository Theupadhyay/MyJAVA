import java.util.ArrayList;
import java.util.HashMap;

public class MaxFreCharacter {
    static char maxFreChara(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int oldFreq = map.get(str.charAt(i));
                int newFre = oldFreq + 1;
                map.put(str.charAt(i),newFre);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        ArrayList<Character> list = new ArrayList<>(map.keySet());
//        System.out.println(list);
        int maxFreq = 0;
        char maxFreqChar = ' ';
        for (char c : list) {
            if (map.get(c)>maxFreq){
                maxFreq = map.get(c);
                maxFreqChar = c;
            }
        }
        return maxFreqChar;
    }
    public static void main(String[] args) {
        System.out.println(maxFreChara("bsdgaaabsdfg"));
    }
}
