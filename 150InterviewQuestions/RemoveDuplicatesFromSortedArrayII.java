class RemoveDuplicatesFromSortedArray {

    /* Created by: Saurabh Chhimwal
     * Email Id: chhimwalsaurabh@gmail.com
     * 
     * Given an integer array nums sorted in non-decreasing order, remove some duplicates 
     * in-place such that each unique element appears at most twice. The relative order of 
     * the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead
 have the result be placed in the first part of the array nums. More formally, if there 
 are k elements after removing the duplicates, then the first k elements of nums should 
 hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input 
array in-place with O(1) extra memory.
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 
1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/
    public int removeDuplicates(int[] nums) {
        
        //[1,1,2] -- [1,2]
        int p1=0;
        int p2=1;
        while(p2<nums.length)
        {
          if(nums[p1]==nums[p2])
          {
            nums[p1]=nums[p2];
            p2++;
          }
          else{
            nums[++p1]=nums[p2++];
            }
        }
        return p1+1;
    }
}