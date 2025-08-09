/* package codechef;
// don't place package name! */

import java.util.*;
import java.lang.*;


public class CompanyWorkHrs {
    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            while(T-->0) {
                int monToThu= s.nextInt()*4;
                int friday= s.nextInt();
                System.out.println(monToThu+friday);
            }
        }
    }


