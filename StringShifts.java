/*
 * <aside>
💡 **Question 6**

Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true

</aside>
 * 
 */
package in.ineuron.gouthami;


public class StringShifts {
    public static boolean canShiftString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String shifted = s;

        for (int i = 0; i < s.length(); i++) {
            if (shifted.equals(goal)) {
                return true;
            }

            shifted = shiftLeft(shifted);
        }

        return false;
    }

    private static String shiftLeft(String s) {
        return s.substring(1) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean canShift = canShiftString(s, goal);

        System.out.println("Shifted string is ::"+  canShift);
    }
}
