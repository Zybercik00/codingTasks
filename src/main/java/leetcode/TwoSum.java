package leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.findTwoSum(new int[]{2, 4, 5, 7}, 9);
        twoSum.findTwoSum(new int[]{3,3}, 6);
        twoSum.findTwoSum(new int[]{3,2,4}, 6);


    }

    public int[] findTwoSum(int[] nums, int target) {
        int[] values = new int[2];
        for (int i=0; i < nums.length; i++) {
            int valueOne = nums[i];
            boolean check = false;
            for (int j = 1; j < nums.length; j++) {
                int valueTwo = nums[j];
                if ((valueOne + valueTwo) == target) {
                    check = true;
                    values[1] = j;
                }
            }
            if (check) {
                values[0] = i;
                break;
            }
        }
        return values;
    }

}
