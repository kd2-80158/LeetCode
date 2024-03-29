public class LongestCommonPrefix {

    /*
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".


Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

     */

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length ==0)
          return "";
        //prefix -- flower
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {  //strs[1]=flow 
           while(strs[i].indexOf(prefix)!=0)
           {
               prefix = prefix.substring(0,prefix.length()-1);
   
               if(prefix.isEmpty())
                 return "";
           }
        }
        return prefix;  
       }
    
}
