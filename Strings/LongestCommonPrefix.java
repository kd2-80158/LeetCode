package Strings;

public class LongestCommonPrefix {

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
