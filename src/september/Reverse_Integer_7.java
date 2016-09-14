package september;

public class Reverse_Integer_7 {
    public static int reverse(int x) 
    {
    	int result = 0;
        int fu = 1;
        if(x<0)
        {
        	fu = -1;
        	x = -x;
        }
        String xstr = String.valueOf(x);
        String restr = "";
        for(int i = xstr.length()-1; i >= 0; i--)
        {
        	restr = restr + xstr.charAt(i);
        }
        try
        {
        	result = Integer.parseInt(restr) * fu;
        }
        catch(Exception e)
        {
        	result = 0;
        }
        return result;
    }
    
    public static void main(String[] arg)
    {
    	int xx = 1534236469;
    	int re = reverse(xx);
    	System.out.println(re);
    }

}
