public class GCD {
        public String gcdOfStrings(String str1, String str2){
            if(str2.length()>str1.length())
            {
                return gcdOfStrings(str2,  str1); // TO make life easier we will just swap if it is not greater
            }
            if(str2.equals(str1))
            {
                return str1; // if the same word then return the word
            }
            if(str1.startsWith(str2))
            {
                return gcdOfStrings(str1.substring(str2.length()),  str2);
            }
            return "";
    }
}
