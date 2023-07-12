/*
 * <aside>
💡 **Question 7**

Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".

</aside>
 * 
 */
package in.ineuron.gouthami;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String finalS = processString(s);
        String finalT = processString(t);

        return finalS.equals(finalT);
    }

    private static String processString(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean isEqual = backspaceCompare(s, t);

        System.out.println("BackSpaceString is ::"+isEqual);
    }
}
