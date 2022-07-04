/*Input: l1 = [2,4,3], l2 = [5,6,4]

Output: [7,0,8]

Explanation: 342 + 465 = 807.*/

package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumbers {
	public static void main(String[] args) {
		
		ListNode list1 = new ListNode(3, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))))))));
		ListNode list2 = new ListNode(7,null);
		ListNode list3 = addTwoNumbers(list1,list2);
		System.out.println("\n");
		while(list3!= null) {
			System.out.print(list3.val);
			list3 = list3.next;
		}
		
	}
	
	
	// Add each node, balance(carry) = 1 then add them
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode emptyNode = new ListNode();
        ListNode currentNode = new ListNode();
        ListNode result = currentNode;
        while (emptyNode != l1 || emptyNode != l2) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            currentNode = (currentNode.next = new ListNode(sum %= 10));
            l1 = null != l1.next ? l1.next : emptyNode;
            l2 = null != l2.next ? l2.next : emptyNode;
        }
        if (carry == 1)
            currentNode.next = new ListNode(carry);
        return result.next;
    }
		
	//Convert to integer, add 2 numbers, then convert integer to ListNode --->> Limited
	
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		long llist1Rever = 0, llist2Rever = 0;
//		
//		ArrayList<String> str1 = new ArrayList<>();
//		ArrayList<String> str2 = new ArrayList<>();
//		
//		while (l1 != null) {
//			str1.add(String.valueOf(l1.val));
//			l1 = l1.next;
//		}
//		while (l2 != null) {
//			str2.add(String.valueOf(l2.val));
//			l2 = l2.next;
//		}
//		Collections.reverse(str1);
//		Collections.reverse(str2);
//		
//		for (int i = 0; i < str1.size(); i++) { 
//			llist1Rever = (llist1Rever + Long.parseLong(str1.get(i))) * 10;
//        }
//		for (int i = 0; i < str2.size(); i++) { 
//			llist2Rever = (llist2Rever + Long.parseLong(str2.get(i))) * 10;
//        }
//		if (llist1Rever != 0) {
//			llist1Rever = llist1Rever / 10;
//		}
//		if (llist2Rever != 0) {
//			llist2Rever = llist2Rever / 10;
//		}
//		
//		
//		long sum = llist1Rever + llist2Rever;
//		ListNode currentNode = new ListNode();
//		ListNode result = currentNode;
//		if (sum == 0) {
//			currentNode = (currentNode.next = new ListNode(0));
//		} else {
//			while (sum > 0) {
//				long tmpLong = sum % 10;
//				int tmpInt = (int) tmpLong;
//				sum /= 10;
//				currentNode = (currentNode.next = new ListNode(tmpInt));
//			}
//		}
//		return result.next;
//	}

	
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
