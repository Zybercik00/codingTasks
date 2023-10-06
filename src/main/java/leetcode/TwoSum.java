package leetcode;

public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            int first = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int second = nums[j];
                int sum = first + second;
                if ( sum == target) {
                    int[] ints = {first, second};
                    return ints;
                }
            }
        }
        return new int[0];
    }
}
