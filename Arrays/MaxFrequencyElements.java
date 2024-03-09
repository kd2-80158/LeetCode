
/*

Author: Saurabh Chhimwal
Date: 09/March/2024

 * You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.
*Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
 */
class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int frequency[] = new int[100];
        //nums = [1,2,2,3,1,4]
         //maxFrequency: 0,1,2
        //count: 0,1,1,(2+2=4)
        int maxFreq = 0;
        int count = 0;

        for(int num : nums)
        {
            frequency[num] += 1;
            if(frequency[num]>maxFreq)
            {
                maxFreq = frequency[num];
                count = frequency[num];
            }
            else if(frequency[num]==maxFreq)
              count += frequency[num];
        }
    return count;
    }
}