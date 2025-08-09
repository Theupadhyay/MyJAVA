//  LeetCode 948 (Bag of tokens)
// You start with an initial power of power, an initial score of 0, and a bag of tokens given as an integer array tokens, where each tokens[i] donates the value of tokeni.
//
//        Your goal is to maximize the total score by strategically playing these tokens. In one move, you can play an unplayed token in one of the two ways (but not both for the same token):
//
//        Face-up: If your current power is at least tokens[i], you may play tokeni, losing tokens[i] power and gaining 1 score.
//        Face-down: If your current score is at least 1, you may play tokeni, gaining tokens[i] power and losing 1 score.
//        Return the maximum possible score you can achieve after playing any number of tokens.


import java.util.Arrays;

public class BagsOfToken {
    static int bagOfTokenScore(int[] arr, int maxPower) {
        Arrays.sort(arr);
        int score =0;
        int maxScore = 0;
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            if (maxPower >= arr[l]) {
                maxPower -= arr[l];
                score++;
                l++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                maxPower += arr[r];
                score--;
                r--;

            }else break;
        }

        return maxScore;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 400, 300};
        int maxPower = 200;
        System.out.println("Max Score is : "+bagOfTokenScore(arr,maxPower));
    }
}
