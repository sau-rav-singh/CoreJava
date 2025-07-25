package gfg;

public class SecondLargest {
    //Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1. Note: The second largest element should not be equal to the largest element.
    public static int getSecondLargest(int[] arr) {
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > lar) {
                secLar = lar;
                lar = num;
            } else if (num > secLar && num != lar) {
                secLar = num;
            }
        }
        if (secLar == Integer.MIN_VALUE) return -1;
        else return secLar;
    }

    public static void main(String[] args) {
        int secondLargest = getSecondLargest(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("Second Largest number is " + secondLargest);
    }
}
