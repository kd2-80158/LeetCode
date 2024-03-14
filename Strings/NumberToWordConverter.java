package Strings;

import java.util.HashMap;
import java.util.Map;

public class NumberToWordConverter {

    public static Map<Character,String> digitMap = new HashMap<>();
    
    static{
        digitMap.put('0',"zero");
        digitMap.put('1',"one");
        digitMap.put('2',"two");
        digitMap.put('3',"three");
        digitMap.put('4',"four");
        digitMap.put('5',"five");
        digitMap.put('6', "six");
        digitMap.put('7',"seven");
        digitMap.put('8',"eight");
        digitMap.put('9',"nine");
    }

    public static String convertNumberToWord(int number)
    {
         String word = String.valueOf(number);
         StringBuilder result = new StringBuilder();

         for(int i=0;i<word.length();i++)
         {
            char digit = word.charAt(i);
            if(digitMap.containsKey(digit))
            {
                result.append(digitMap.get(digit));
            }
            else
                result.append(digit);
         }
         return result.toString();
    }

    public static void main(String[] args) {
        int number = 785;
        
        String result = convertNumberToWord(number);

        System.out.println(result);
    }
    
}
