package Quiz;

// Implement closestToZero to return the integer in th array ints that is closest to zero.

// * if there are two integers equally closest to zero, consider the positive element to
//   be closer to zero (example: if ints contains -5 and 5, return 5)
// * if ints is null or empty, return 0.

// Input: integers in ints have values ranging from -2147483647 to 2147483647.
public class B {


        int closestToZero ( int[] ints) {
            if (ints == null || ints.length == 0) {
                return 0;
            }

            int closest = ints[0];
            int distance = closest < 0 ? -closest : closest;
            for (int index = 1; index < ints.length; index++) {
                int element = ints[index];
                int elementDistance = element < 0 ? -element : element;
                if (elementDistance < distance) {
                    closest = element;
                    distance = elementDistance;
                } else if (elementDistance == distance && element > 0) {
                    closest = element;
                }
            }
            return closest;
        }
}
