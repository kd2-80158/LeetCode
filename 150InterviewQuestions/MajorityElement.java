public class MajorityElement {

    /* Created by: Saurabh Chhimwal
     * Email Id: chhimwalsaurabh@gmail.com
     * 
     * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may 
assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;
        //Pass 1: find the majority element in an array
        for (int i=0;i<nums.length;i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count++;
            } else if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
            //count += (nums[i] == majorityElement) ? 1 : -1;
        }
        // Pass 2: In this we need to find the no. of occurrences of majority element. 
        // So, Reset the count to count occurrences of the potential majority element
        count = 0;  
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majorityElement;
        } else {
            //it returns 0 if no majority element is found
            return 0;  
        }
    }
    
}
