import java.util.ArrayList;
import java.util.List;

/*
Author: Saurabh Chhimwal
Date: 29/March/2024

 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */

public class DuplicateElementInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> answer = new ArrayList<>();

        for(int num: nums)
        {
            nums[Math.abs(num)-1] *= -1;
        }

        for(int num: nums)
        {
            if(nums[Math.abs(num)-1]>0)
            {
                answer.add(Math.abs(num));
                nums[Math.abs(num)-1] *= -1;
            }
        }
        return answer;
    }
    
}
