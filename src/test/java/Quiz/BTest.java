package Quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTest {

    @Test
    void closestToZero() {
        B b = new B();
        int x = b.closestToZero(new int[]{9,8,7,5,10,-5,16,-6,-2,2,19,-1,1,});
        assertEquals(1, x);

    }
    @Test
    void closestToZero2() {
        B b = new B();
        int x = b.closestToZero(new int[]{9,8,7,5,10,-5,16,-6,-2,2,19,-1,1,-1,-1});
        assertEquals(1, x);

    }
    @Test
    void closestToZero3() {
        B b = new B();
        int x = b.closestToZero(new int[]{2, -1, -1, -1, 2});
        assertEquals(-1, x);
    }
    @Test
    void closestToZero4() {
        B b = new B();
        int x = b.closestToZero(new int[]{200000, -10000, -100, -1000, 456576, -100});
        assertEquals(-100, x);
    }
    @Test
    void testSingleElement() {
        B b = new B();
        int x = b.closestToZero(new int[]{-1});
        assertEquals(-1, x);
    }
    @Test
    void closestToZero6() {
        B b = new B();
        int x = b.closestToZero(new int[]{-1,-1});
        assertEquals(-1, x);
    }
    @Test
    void closestToZero7() {
        B b = new B();
        int x = b.closestToZero(new int[]{-1, 1, -1, 1});
        assertEquals(-1, x);
    }
}