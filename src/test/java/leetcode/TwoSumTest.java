package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest() {
        TwoSum twoSum = new TwoSum();
        twoSum.findTwoSum(new int[]{2,2,2,3,5}, 5);
        System.out.println(twoSum);

    }
}