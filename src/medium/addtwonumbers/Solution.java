package medium.addtwonumbers;

public class Solution 
{
public static void main(String[] args) 
{

	ListNode l1 = new ListNode(3);
			 l1.next = new ListNode(4);
			 l1.next.next = new ListNode(2);
	
	ListNode l2 = new ListNode(4);
			 l2.next = new ListNode(6);
			 l2.next.next = new ListNode(5);
	
	ListNode ans = addTwoNumbers(l1, l2);
	
	printListNode(ans);
	
	
}

public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
{
	ListNode dummynode = new ListNode(0);
	ListNode p = l1;
	ListNode q = l2;
	ListNode curr = dummynode;
	int carry =0;
	while(p!=null||q!=null)
	{
		int x = (p!=null)?p.val:0;
		int y = (q!=null)?q.val:0;	
		int	sum = carry + x + y; 
		carry = sum/10;
		
		curr.next = new ListNode(sum%10);
		curr = curr.next;
		if(p!=null)
			p = p.next;
		if(q!=null)
			q = q.next;
	}
	if(carry>0)
	{
		curr.next = new ListNode(carry);
	}
	
	return dummynode.next;
}

public static void printListNode(ListNode inputlist)
{

	while (inputlist!=null) 
	{
		System.out.print(inputlist.val);
		inputlist = inputlist.next;
	}
}

}
