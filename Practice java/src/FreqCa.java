import java.util.HashMap;

public class FreqCa {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "jjhjghjkljkhfdjdkhldkflk;djhfds';dhfdfdhf'd;hfdfd'jfhdf'dfhdfjdhfd;hfdlfhdjfhghrj;jlrhevn48389u4yh'r;f'd";
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}
