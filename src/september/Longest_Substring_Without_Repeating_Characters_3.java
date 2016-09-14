package september;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Longest_Substring_Without_Repeating_Characters_3 {
	public int lengthOfLongestSubstring(String s) {
        int lnum = 1;
//        ArrayList<String> reset = new ArrayList();  
        int left = 0;
        int right = 0;
        char[] ss = s.toCharArray();
        Map<String,Integer> subset = new HashMap<String,Integer>();
        for(int i=0;i<s.length();i++)
        {
            String temax = "" + ss[i];
            if(!subset.containsKey(temax))
            {
                subset.put(temax,i);
                right = i;
            }
            else
            {
                int oldleft = left;
                left = subset.get(temax)+1;
                for(int qq = oldleft;qq<left;qq++)
                {
                    String teold = "" + ss[qq];
                    subset.remove(teold);
                }
                subset.put(temax,i);
                int nlength = right - oldleft + 1;
                right = i;
                if(nlength > lnum)
                {
                    lnum = nlength;
                }
            }
            if(right == s.length()-1)
            {
                int nlength = right - left + 1;
                if(nlength > lnum)
                {
                    lnum = nlength;
                    
                }
            }
            
        }
        if(s.length() == 0)
        {
            return 0;
        }
        return lnum;
    }
}
