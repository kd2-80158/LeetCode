public class Unlucky1 {

/*
*Author - Saurabh Chhimwal
*Date: 18/03/2024
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in 
the array.

* unlucky1([1, 3, 4, 5]) → true
* unlucky1([2, 1, 3, 4, 5]) → true
* unlucky1([1, 1, 1]) → false
     */

    public boolean unlucky1(int[] nums) {
  
        for(int i=0;i<nums.length-1;i++)
        {
          if(i+1<nums.length && nums[0]==1 && nums[1]==3 || i+1<nums.length && nums[1]==1 && nums[2]==3
             || nums[nums.length-2]==1 && nums[nums.length-1]==3)
            return true;
        }
        return false;
      }
    
}
