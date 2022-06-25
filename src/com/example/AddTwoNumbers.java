/*Input: l1 = [2,4,3], l2 = [5,6,4]

Output: [7,0,8]

Explanation: 342 + 465 = 807.*/

package com.example;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3,null)));
		ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4,null)));
		ListNode list3 = addTwoNumbers(list1,list2);
		while(list3!= null) {
			System.out.println(list3.val);
			list3 = list3.next;
		}
		
	}
	
	// Add each node, balance(carry) = 1 then add them
	
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode emptyNode = new ListNode();
//        ListNode currentNode = new ListNode();
//        ListNode result = currentNode;
//        while (emptyNode != l1 || emptyNode != l2) {
//            int sum = l1.val + l2.val + carry;
//            carry = sum / 10;
//            currentNode = (currentNode.next = new ListNode(sum %= 10));
//            l1 = null != l1.next ? l1.next : emptyNode;
//            l2 = null != l2.next ? l2.next : emptyNode;
//        }
//        if (carry == 1)
//            currentNode.next = new ListNode(carry);
//        return result.next;
//    }
	
	//Convert to integer, add 2 numbers, then convert integer to ListNode
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int llist1 = 0, llist2 = 0;
		int llist1Rever = 0, llist2Rever = 0;
		while (l1 != null || l2 != null) {
			llist1 = (llist1 + l1.val) * 10;
			llist2 = (llist2 + l2.val) * 10;
			l1 = l1.next;
			l2 = l2.next;
		}

		llist1 = llist1 / 10;
		llist2 = llist2 / 10;

		while (llist1 != 0 || llist2 != 0) {
			int digit1 = llist1 % 10;
			llist1Rever = llist1Rever * 10 + digit1;
			llist1 /= 10;
			int digit2 = llist2 % 10;
			llist2Rever = llist2Rever * 10 + digit2;
			llist2 /= 10;
		}
		int sum = llist1Rever + llist2Rever;
		ListNode currentNode = new ListNode();
		ListNode result = currentNode;
		while (sum > 0) {
			int tmp = sum % 10;
			sum /= 10;
			currentNode = (currentNode.next = new ListNode(tmp));
		}
		return result.next;
	}
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	
}
