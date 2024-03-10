
/*
Author: Saurabh Chhimwal
Date: 11/March/2024

 * Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).

 

Example 1:

Input: s = "ca"
Output: 2
Explanation: You can't remove any characters, so the string stays as is.

Example 2:

Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".

Constraints:

1 <= s.length <= 10^5
s only consists of characters 'a', 'b', and 'c'.
 */

public class MinimumStringLength {

    public static int minimumLength(String s) {

        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        int length = 0;
        while(start<end && arr[start]==arr[end])
        {
           char find = arr[start];

           while(start<=end && arr[start]==find)
                start++;
           while(end>start && arr[end]==find)
                end--;
        }

        length = end - start +1;
        return length;
        
    }
 public static void main(String[] args) {
    
    String s = "ca";

    int result = minimumLength(s);
    System.out.println(result);
 }   
}
