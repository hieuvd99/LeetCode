package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Input: candidates = [2,3,6,7], target = 7 
 * Output: [[2,2,3],[7]] 
 * Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. 
 * Note that 2 can be used multiple times. 7 is a candidate, and 7 = 7. 
 * These are the only two combinations.
 * 
 * Input: candidates = [2,3,5], target = 8 Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * Input: candidates = [2], target = 1 Output: []
 * 
 * 1 <= candidates.length <= 30 
 * 1 <= candidates[i] <= 200 
 * All elements of candidates are distinct. 
 * 1 <= target <= 500
 */

public class CombinationSum {
	
	public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        findNumbers(ans, arr, target, 0, 0, 0, temp);
        return ans;
    }
 
    public static void findNumbers(List<List<Integer> > ans,
                int[] arr, int target, int check, int start, int index, ArrayList<Integer> temp) {
 
        if (check >= target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            if ((start + arr[i]) <= target) {
            	check = start + arr[i];
                temp.add(arr[i]);
                findNumbers(ans, arr, target, check, start + arr[i], i, temp);
                System.out.println(temp);
                temp.remove(temp.size()-1);
            }
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 8;
 
        List<List<Integer> > ans = combinationSum(arr, target);
        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < ans.size(); i++) {
 
            System.out.print("(");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }
    }
    
//    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum)
//    {
//        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
//        ArrayList<Integer> temp = new ArrayList<>();
// 
//        Set<Integer> set = new HashSet<>(arr);
//        arr.clear();
//        arr.addAll(set);
//        Collections.sort(arr);
// 
//        findNumbers(ans, arr, sum, 0, temp);
//        return ans;
//    }
// 
//    static void
//    findNumbers(ArrayList<ArrayList<Integer> > ans,
//                ArrayList<Integer> arr, int sum, int index,
//                ArrayList<Integer> temp)
//    {
// 
//        if (sum == 0) {
//            ans.add(new ArrayList<>(temp));
//            return;
//        }
// 
//        for (int i = index; i < arr.size(); i++) {
//            if ((sum - arr.get(i)) >= 0) {
// 
//                temp.add(arr.get(i));
// 
//                findNumbers(ans, arr, sum - arr.get(i), i, temp);
// 
//                temp.remove(arr.get(i));
//            }
//        }
//    }
// 
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
// 
//        arr.add(2);
//        arr.add(3);
//        arr.add(5);
// 
//        int sum = 8;
// 
//        ArrayList<ArrayList<Integer> > ans
//            = combinationSum(arr, sum);
//        if (ans.size() == 0) {
//            System.out.println("Empty");
//            return;
//        }
//        for (int i = 0; i < ans.size(); i++) {
// 
//            System.out.print("(");
//            for (int j = 0; j < ans.get(i).size(); j++) {
//                System.out.print(ans.get(i).get(j) + " ");
//            }
//            System.out.print(") ");
//        }
//    }
}
