package InterviewPrep.Stack;

import java.util.Stack;

public class DailyTemperatures {
    // QUESTION: Given an array of integers temperatures represents the daily temperatures,
    // return an array answer such that answer[i] is the number of days you have to wait
    // after the ith day to get a warmer temperature. If there is no future day for which
    // this is possible, keep answer[i] == 0 instead.
    // Example: Input: temperatures = [73,74,75,71,69,72,76,73]
    //          Output: [1,1,4,2,1,1,0,0]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        
        System.out.print("Result: ");
        for (int day : result) {
            System.out.print(day + " ");
        }
        System.out.println(); // Output: 1 1 4 2 1 1 0 0
    }
}
