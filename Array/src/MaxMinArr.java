import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArr {
    public static void main(String[] args) {
        int[]  arr = { 2,5,9,6,3,4};
        Arrays.sort(arr);
        System.out.println(arr[0]+" is min , "+ arr[arr.length-1]+" is max");
    }
}
