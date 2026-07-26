package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // QUESTION: Given an array of distinct integers candidates and a target integer target, return a list of
    // all unique combinations of candidates where the chosen numbers sum to target. The same number may be
    // chosen from candidates an unlimited number of times.
    // Example: Input: candidates = [2,3,6,7], target = 7
    //          Output: [[2,2,3],[7]]
    // Time Complexity: O(N^(T/M + 1)) where N is candidates, T is target, M is min candidate
    // Space Complexity: O(T/M) for recursion stack

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, 
                                  int[] candidates, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (remaining < 0) return;

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(result, current, candidates, remaining - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
