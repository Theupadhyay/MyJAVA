public class validPalindrome {
        public boolean isPalindrome(String s) {
            String s1 = "";
            char c;
            String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            for (int i = 0; i < s2.length(); i++) {
                c = s2.charAt(i);
                s1 = c + s1;
            }
            if (s2.equals(s1)) {
                return true;
            } else {
                return false;
            }
        }
}

/*
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>64 && s.charAt(i)<123 || s.charAt(i)>47 && s.charAt(i)<58){
                if(s.charAt(i)>90 && s.charAt(i)<97){
                    continue;
                } else if(s.charAt(i)>64 && s.charAt(i)<91){
                    sb.append((char)(s.charAt(i)+32));
                } else{
                    sb.append(s.charAt(i));
                }
            }
        }

        int i=0; int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            } else{
                return false;
            }
        }
        return true;
    }
}
 */
