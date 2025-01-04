package RandomPractice;

public class MaxSumSubArray {
    //find the max sum of contiguous subarrays in an array of integers
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int sum = 0;
        int maxSum=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            maxSum=Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
