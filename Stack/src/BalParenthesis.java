import java.util.Stack;
public class BalParenthesis {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        String str = "(())(";
        int count= 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == '('){
                stack.push("(");
                count++;
            }else{
                stack.pop();
                count--;
            }
        }
        System.out.println(count);
    }
}
