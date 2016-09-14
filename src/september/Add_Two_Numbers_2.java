package september;

/*
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Add_Two_Numbers_2 {

	public static ListNode_2 addTwoNumbers(ListNode_2 l1, ListNode_2 l2)
	{
		ListNode_2 result = new ListNode_2(0);
		ListNode_2 tere = result;
		ListNode_2 l1ptr = l1;
		ListNode_2 l2ptr = l2;
		int jinwei = 0;
		int isbegin = 1;
		while(l1ptr!=null&&l2ptr!=null)
		{
			//xiang jia
			int teadd = l1ptr.val+l2ptr.val+jinwei;
			jinwei = 0;
			System.out.println(teadd);
			if (teadd >9)
			{
				teadd = teadd - 10;
				jinwei = 1;
			}
			
			if(isbegin == 1)
			{
				result.val = teadd;
				isbegin = 0;
			}
			else
			{
				ListNode_2 tenew = new ListNode_2(teadd);
				tere.next = tenew;
				tere = tenew;
			}
			l1ptr = l1ptr.next;
			l2ptr = l2ptr.next;
		}
		while(l1ptr!=null)
		{
			int teadd = l1ptr.val+jinwei;
			jinwei = 0;
			if (teadd >9)
			{
				teadd = teadd - 10;
				jinwei = 1;
			}
			
			if(isbegin == 1)
			{
				result.val = teadd;
				isbegin = 0;
			}
			else
			{
				ListNode_2 tenew = new ListNode_2(teadd);
				tere.next = tenew;
				tere = tenew;
			}
			l1ptr = l1ptr.next;
		}
		while(l2ptr!=null)
		{
			int teadd = l2ptr.val+jinwei;
			jinwei = 0;
			if (teadd >9)
			{
				teadd = teadd - 10;
				jinwei = 1;
			}
			
			if(isbegin == 1)
			{
				result.val=teadd;
				isbegin = 0;
			}
			else
			{
				ListNode_2 tenew = new ListNode_2(teadd);
				tere.next = tenew;
				tere = tenew;
			}
			l2ptr = l2ptr.next;
		}
		
		if(jinwei!=0)
		{
			ListNode_2 tenew = new ListNode_2(jinwei);
			tere.next = tenew;
			tere = tenew;
		}
		return result;
		
	}
	public static void main(String[] xx)
	{
		ListNode_2 res1 = new ListNode_2(2);
		ListNode_2 tere1 = res1;
		tere1.next = new ListNode_2(4);
		tere1 = tere1.next;
		tere1.next = new ListNode_2(3);
		tere1 = res1;
		
		ListNode_2 res2 = new ListNode_2(5);
		ListNode_2 tere2 = res2;
		tere2.next = new ListNode_2(6);
		tere2 = tere2.next;
		tere2.next = new ListNode_2(3);
		
		ListNode_2 tere = addTwoNumbers(res1,res2);
		while(tere!=null)
		{
			System.out.print(tere.val);
			tere=tere.next;
		}
		
		
	}
}


