package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
        int uniqe = remove.removeDuplicates(new int[]{1,1, 2, 2, 3, 4, 4});
        assertEquals(4,uniqe);
        System.out.println(uniqe);
    }
}