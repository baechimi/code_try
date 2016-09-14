package september;

import java.util.HashMap;
import java.util.Map;

public class Median_of_Two_Sorted_Arrays_4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nleng1 = nums1.length;
        int nleng2 = nums2.length;
        int tleng = nleng1 + nleng2;
        Map<Integer,String> rankmark = new HashMap<Integer,String>();
        int ii = 0; //rankmarknum
        int nindex1 = 0;
        int nindex2 = 0;
        double result = 0;
        while(nindex1<nleng1 || nindex2<nleng2)
        {
            if(nindex1 == nleng1)
            {
                rankmark.put(ii,"n2_"+nindex2);
                ii++;
                nindex2++;
                continue;
            }
            if(nindex2 == nleng2)
            {
                rankmark.put(ii,"n1_"+nindex1);
                ii++;
                nindex1++;
                continue;
            }
            
            int n1num = nums1[nindex1];
            int n2num = nums2[nindex2];
            
            if(n1num<n2num)
            {
                rankmark.put(ii,"n1_"+nindex1);
                ii++;
                nindex1++;
            }
            else
            {
                rankmark.put(ii,"n2_"+nindex2);
                ii++;
                nindex2++;
            }
            
        }
        if(tleng%2 == 0)
        {
            int mid = tleng/2;
            String m1num = rankmark.get(mid-1);
            String[] m1numset = m1num.split("_");
            int mindex1 = Integer.parseInt(m1numset[1]);  //Integer.parseInt :string to int
            if(m1numset[0].equals("n1"))  //equals("n1"))
            {
                result += nums1[mindex1]; 
            }
            else
            {
                result += nums2[mindex1];
            }
            
            String m2num = rankmark.get(mid);
            String[] m2numset = m2num.split("_");
            int mindex2 = Integer.parseInt(m2numset[1]);
            if(m2numset[0].equals("n1"))
            {
                result += nums1[mindex2];
            }
            else
            {
                result += nums2[mindex2];
            }
            result = result/2; 
        }
        else
        {
            int mid = tleng/2;
            String m1num = rankmark.get(mid);
            String[] m1numset = m1num.split("_");
            int mindex1 = Integer.parseInt(m1numset[1]); 
            if(m1numset[0].equals("n1"))
            {
                result += nums1[mindex1];
            }
            else
            {
                result += nums2[mindex1];
            }
        }
        return result;
    }

}
