package september;

public class Longest_Palindromic_Substring_5 {
//hui wen abccba

   public static String longestPalindrome(String s) {
       String maxre = "";
//       String max1="",max2="";
       if(s.length() == 1)
       {
       	maxre = s;
       	return s;
       }
       else
       {
       	char leftchar = s.charAt(0);
       	char rightchar = s.charAt(s.length()-1);
       	if(leftchar == rightchar)
       	{
       		if(s.length()==2)
       			return s;
       		String temax = longestPalindrome(s.substring(1,(s.length()-1)));
       		if(temax.length()!=(s.length()-2))
       		{
       			String lleft = s.substring(0,(s.length()-1));
       		    String rright = s.substring(1);
       		    String leftmax = longestPalindrome(lleft);
       		    String rightmax = longestPalindrome(rright);
       		    if(leftmax.length()>rightmax.length())
       		    {
       			    maxre = leftmax;
       		    }
       		    else
       		    {
       			    maxre = rightmax;
       		    }
       		}
       		else
       		{
       			maxre = leftchar+temax+rightchar;
       		}
       	}
       	if(leftchar != rightchar)
       	{
       		String leftmax = longestPalindrome(s.substring(0,(s.length()-1)));
       		String rightmax = longestPalindrome(s.substring(1));
       		if(leftmax.length()>rightmax.length())
       		{
       			maxre = leftmax;
       		}
       		else
       		{
       			maxre = rightmax;
       		}
       	}
       }/*
       if(max1.length()>max2.length())
       {
           maxre = max1;
       }
       else
           maxre = max2;*/
       return maxre;
   }

   static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public String longestPalindrome_dui(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
   
    public static void main(String[] xx)
    {
    	String ff = "aaabaaaa";
    	String re = longestPalindrome(ff);
    	String re2 = longestPalindrome(ff.substring(0,ff.length()-1));
    	System.out.println("rr"+re);
    	System.out.println("rr2"+re2);
    	System.out.println(ff.substring(1));
	}
}
