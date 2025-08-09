import java.util.*;
import java.lang.*;
import java.io.*;
public class Exam {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner Exams = new Scanner(System.in);
            // test cases
            int test = Exams.nextInt();
            while(test-->0){
                // x value
                int school = Exams.nextInt();
                //y value
                int students = Exams.nextInt();
                // z value
                int total = Exams.nextInt();
                //appeared for exam
                int appear = school * students;


                if(total > appear/2){
                    System.out.println("yes");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
