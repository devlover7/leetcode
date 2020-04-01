# Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. <br />
The digits are stored in reverse order and each of their nodes contain a single digit. <br />
Add the two numbers and return it as a linked list. <br />
You may assume the two numbers do not contain any leading zero, except the number 0 itself. <br />

Solution By Abhinav Gour <br />
<br />
### Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
ListNode (2) -> ListNode (4) -> ListNode (3) <br /> 
ListNode (5) -> ListNode (6) -> ListNode (4) <br /> 
### Output: 7 -> 0 -> 8
### Explanation: 342 + 465 = 807.

Step 1 Create Temprory List Node with preceeding element 0 i.e ListNode temp = new ListNode(0); & a Carry = 0;

Step 2: Iterate with the input ListNode 1 say p, & ListNode 2 say q. while p OR q Not Equals to Null.

Step 3: Store the digit (if available) with initiazing both the elements as x , y and stored the digit.

Step 4: sum up the both the stored digit x & y with the zero (previously initialized) carry store it in a int sum. 

Step 5: add the preceding digit of sum i.e(sum%10)vto the temp.







<br />

