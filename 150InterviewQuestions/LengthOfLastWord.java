public class LengthOfLastWord {

    /* Created by: Saurabh Chhimwal
    * Date : 29/Mar/2023
     * Email Id: chhimwalsaurabh@gmail.com
     * 
     * Given a string s consisting of words and spaces, return the length of the last word 
     * in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

*/

    public int lengthOfLastWord(String s) {
        
        s = s.trim();

        int length=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!= ' ')
              length++;
            
            else if(length>0)
              break;
        }
        return length;
    }
    
}
