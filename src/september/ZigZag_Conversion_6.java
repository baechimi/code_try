package september;

public class ZigZag_Conversion_6 {

    public static String convert(String s, int numRows) 
    {
    	if(numRows==1)
        {
            return s;
        }
    	String result = "";
    	String[] rearray = new String[numRows];
    	for(int i=0;i<numRows;i++)
    	{
    	    rearray[i]="";
    	}
    	int slen = s.length();
    	int mark = 0;
    	int reverse = 0;
    	for(int i=0;i<slen;i++)
    	{
    		if(reverse==0)
    		{
    			//int ind = mark%numRows - 1;
    			rearray[mark] = rearray[mark] + s.charAt(i);
    			mark++;
    			if(mark==numRows)
    			{
    				reverse=1;
    				mark--;
    			}
    		}
    		else
    		{
    			mark--;
    			rearray[mark] = rearray[mark] + s.charAt(i);
    			if(mark==0)
    			{
    				reverse=0;
    				mark++;
    			}
    		}
    	}
    	for(int j=0;j<numRows;j++)
    	{
    		System.out.println(rearray[j]);
    		result = result + rearray[j];
    	}
        return result;
    }
	public static void main(String[] xx)
	{
		String qq = "PAYPALISHIRING";
		System.out.println(convert(qq,3));
	}
}
