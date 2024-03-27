class RemoveDuplicatesFromSortedArray {

    /* Created by: Saurabh Chhimwal
     * Email Id: chhimwalsaurabh@gmail.com
     * 
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates 
     * in-place such that each unique element appears only once. The relative order of the 
     * elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do 
the following things:

Change the array nums such that the first k elements of nums contain the unique elements 
in the order they were present in nums initially. The remaining elements of nums are not 
important as well as the size of nums.
Return k.
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