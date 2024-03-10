/*

Author: Saurabh Chhimwal
Date: 10/March/2024

 * You are given a binary string s that contains at least one '1'.

You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.

Return a string representing the maximum odd binary number that can be created from the given combination.

Note that the resulting string can have leading zeros.
* Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with 
the remaining digits is "100". So the answer is "1001".
 */
public class MaxOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        //in java, the string is immutable to first convert the string into char array to modify its value at required index
        char arr[] = s.toCharArray();
        //this is two-pointer approach, the first pointer called left is mounted on the 0th index and the
        //second pointer is mounted on the last index of an array
        int left=0;
        int right=arr.length-1;

         //s=0101
         //desired output -- 1001 
        while(left<=right)
        {
            if(arr[left]=='1')
              left++;
            if(arr[right]=='0')
              right--;
            if(left < right && arr[left]=='0' && arr[right]=='1')
            {
                arr[left]='1';
                arr[right]='0';
            }
        }
        arr[left-1] = '0';
        arr[arr.length-1] = '1';

        return new String(arr); 
        
    }
    
}
