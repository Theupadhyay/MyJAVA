//Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.
//Display the most fit trainee (or trainees) and the highest average oxygen level.
//Note:
//	• The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
//	• If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
//	• Average Oxygen Values should be rounded.
//Example 1:
//INPUT VALUES
//95
//92
//95
//92
//90
//92
//90
//92
//90
//OUTPUT VALUES
//Trainee Number : 1
//Trainee Number : 3
//Note:
//Input should be 9 integer values representing oxygen levels entered in order as
//Round 1
//	• Oxygen value of trainee 1
//	• Oxygen value of trainee 2
//	• Oxygen value of trainee 3
//Round 2
//	• Oxygen value of trainee 1
//	• Oxygen value of trainee 2
//	• Oxygen value of trainee 3
//Round 3
//	• Oxygen value of trainee 1
//	• Oxygen value of trainee 2
//	• Oxygen value of trainee 3
//Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT”

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] oxygenLevel = new int[3][3];
        boolean invalidInput = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int oxygen = sc.nextInt();
                if(oxygen < 1 || oxygen >100)
                    invalidInput = true;
                oxygenLevel[i][j] = oxygen;
            }
        }
        if(invalidInput){
            System.out.println("Invalid Input");
            return;
        }

        int[] average = new int[3];
        for (int i = 0; i < 3; i++) {
            average[i] = oxygenLevel[i][0] + oxygenLevel[i][1] + oxygenLevel[i][2] /3;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if(average[i]>max){
                max = average[i];
            }
        }
        if (max < 70) {
            System.out.println("All tranee are unfit");
        } else {
            for (int i = 0; i < 3; i++) {
                if (average[i] == max) {
                    System.out.println("tranee no "+(i+1));
                }
            }
        }

    }
}
