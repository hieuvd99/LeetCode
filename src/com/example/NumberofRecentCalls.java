/*Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
*/

package com.example;

import java.util.LinkedList;

public class NumberofRecentCalls {
	
//==========LinkedList=============	
	
	public static void main(String[] args) {
		NumberofRecentCalls obj = new NumberofRecentCalls();
		int param_1 = obj.ping(1);
		System.out.println(param_1);
		int param_2 = obj.ping(100);
		System.out.println(param_2);
		int param_3 = obj.ping(3001);
		System.out.println(param_3);
		int param_4 = obj.ping(3002);
		System.out.println(param_4);
	}
	
	static LinkedList<Integer> llist;
	public NumberofRecentCalls() {
		llist = new LinkedList<Integer>();
	}

	public int ping(int t) {
		llist.add(t);
        while (llist.getFirst() < t-3000) {
        	llist.removeFirst();
        }      
        return llist.size();
	}
	
	//==========Array=============		
//	public static void main(String[] args) {
//		NumberofRecentCalls obj = new NumberofRecentCalls();
//		int param_1 = obj.ping(1,1);
//		System.out.println(param_1);
//		int param_2 = obj.ping(100,2);
//		System.out.println(param_2);
//		int param_3 = obj.ping(3001,3);
//		System.out.println(param_3);
//		int param_4 = obj.ping(3002,4);
//		System.out.println(param_4);
//		
//	}
//	
//	static int[] arr;
//	public NumberofRecentCalls() {
//		arr = new int[5000];
//	}
//	
//	public int ping(int t, int i) {
//		arr[i] = t;
//		int count = 0;
//		int r;
//		//Kiem tra gia tri bat dau cua mang
//		if(t-3000 < 0 ) {
//			r=0;
//		}
//		else {
//			r= t-3000;
//		}
//		for( ; r <= t; r++ ) {
//			if(arr[r]-1>=0) {	//Kiem tra ton tai 
//				count++;
//			}
//		}
//		return count++;
//	}
	


}

