package Strings;

public class FourDigitsNumberWordConverter {
    

    public static String convertNumberToString(int num)
    {
        String[] units = {"","one","two","three","four","five","six","seven","eight","nine"};
        String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigtheen","nineteen"};
        String[] tens = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

        String word = "";

        if(num<10)
        {
            word = units[num];
        }
        else if(num<20)
        {
            word = teens[num-10];
        }
        else if(num<100)
        {
            word = tens[num/10]+ " "+units[num%10];
        }
        else if(num<1000){
            word = units[num/100] + " Hundred "+ convertNumberToString(num%100);
        }
        else
        {
            word = units[num/1000] + " Thousand " + convertNumberToString(num%1000); 
        } 
              
        return word;
    }

    public static void main(String[] args) {
        int num =9991;

        String result = convertNumberToString(num);
        System.out.println(result);
    }
}
