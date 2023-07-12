/*
 * <aside>
💡 **Question 4**

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"

</aside>
 * 
 */


package in.ineuron.gouthami;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        result.setLength(result.length() - 1);  // Remove the trailing space

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String reversed = reverseWords(s);

        System.out.println("Reversed word is ::"+reversed);
    }
}

