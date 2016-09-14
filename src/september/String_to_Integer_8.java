package september;

public class String_to_Integer_8 {
    public int myAtoi(String str) {  
        int i = 0;  
        if (str.length() == 0) //¡°¡±
        {  
            return 0;  
        }  
        while (i < str.length() && str.charAt(i) == ' ') //hu lve kong ge 
        {  
            i++;  
        }  
        int sign = 1;  
        
        //fu hao
        if (str.charAt(i) == '+') 
        {  
            i++;  
        } else if (str.charAt(i) == '-') 
        {  
            i++;  
            sign = -1;  
        }  
  
        int number = 0;  
        //xun huan suan shu
        while (i < str.length()) 
        {  
            if (str.charAt(i) < '0' || str.charAt(i) > '9') 
            { //illegal  fei shu zi zi fu
                return sign * number;  
            }  
            //gen max bi, bi qian n-1 wei ji ke
            if (Integer.MAX_VALUE / 10 < number  || (Integer.MAX_VALUE / 10 == number && (str.charAt(i) - '0') > Integer.MAX_VALUE % 10))
            {  
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;  
            }  
            number = 10 * number + str.charAt(i) - '0';  
            i++;  
        }  
        return sign * number;  
    }  
}
