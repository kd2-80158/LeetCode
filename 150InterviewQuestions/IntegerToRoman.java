import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    /* Created by: Saurabh Chhimwal
     * Email Id: chhimwalsaurabh@gmail.com
     * 
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is 
written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V 
+ II.

Roman numerals are usually written largest to smallest from left to right. However, the 
numeral for four is not IIII. Instead, the number four is written as IV. Because the one 
is before the five we subtract it making four. The same principle applies to the number 
nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.


*/

    public String intToRoman(int num) {
        // Create a mapping of Roman numerals to their corresponding decimal values
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "I");
        hmap.put(4, "IV");
        hmap.put(5, "V");
        hmap.put(9, "IX");
        hmap.put(10, "X");
        hmap.put(40, "XL");
        hmap.put(50, "L");
        hmap.put(90, "XC");
        hmap.put(100, "C");
        hmap.put(400, "CD");
        hmap.put(500, "D");
        hmap.put(900, "CM");
        hmap.put(1000, "M");

        // Define an array of decimal values in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // Initialize an empty string to store the Roman numeral
        String roman = "";

        // Iterate through the values array to construct the Roman numeral
        for (int value : values) {
            // Append the corresponding Roman numeral symbols based on the current value
            while (num >= value) {
                roman += hmap.get(value);
                num -= value;
            }
        }

        return roman;
    }
}
