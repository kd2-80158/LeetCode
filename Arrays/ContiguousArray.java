import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=nums[i] == 1 ? sum+1 : sum-1;
            if(map.containsKey(sum))
            {
                maxLength = Math.max(i-map.get(sum),maxLength);
            }
            else
               map.put(sum,i);
        }

        return maxLength;
        
    }
}
