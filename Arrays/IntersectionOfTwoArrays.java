import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Author: Saurabh Chhimwal
Date: 10/March/2024

 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

      List<Integer> list = new ArrayList<>();

      Map<Integer,Integer> mapList = new HashMap<>();

      for(int num: nums1)
      {
          mapList.put(num,1);
      } 
      for(int num: nums2)
      {
          if(mapList.containsKey(num) && mapList.get(num)==1)
          {
              mapList.put(num,0);
              list.add(num);
          }
      }
      int result[] = new int[list.size()];
      for(int i=0;i<list.size();i++)
      {
          result[i] = list.get(i);
      }
      return result;
    }
    
}
