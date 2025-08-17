import java.util.HashMap;
public class FirstNonRepeatingChar {
    public static char firstNonRepeatingChar(String str){
        HashMap<Character , Integer> map = new HashMap<>();

        for (char c : str.toCharArray() ) {
            map.put(c ,map.getOrDefault(c ,0) +1);
        }
        for (int i = 0; i <str.length() ; i++) {
            if(map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String str = "abhishek";
        System.out.println(firstNonRepeatingChar(str));
    }
}
