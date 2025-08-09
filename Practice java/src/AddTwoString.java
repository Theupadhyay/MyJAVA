public class AddTwoString {
   static public String addStrings(String num1, String num2) {
    /*
    it is only valid for small values.
    int str1 = Integer.parseInt(num1);
       int str2 = Integer.parseInt(num2);

       int ans = str1 + str2;
       String sum = String.valueOf(ans);
      return sum;
      */

       StringBuilder str = new StringBuilder();

       int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

       while (i >= 0 || j >= 0 || carry > 0) {
           int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
           int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

           sum = digit1 + digit2 + carry;
           str.append(sum % 10);
           carry = sum / 10;
       }

       return str.reverse().toString();

    }
}
