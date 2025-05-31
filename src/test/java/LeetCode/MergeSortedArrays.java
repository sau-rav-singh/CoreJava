package LeetCode;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        merge(nums1_1, m1, nums2_1, n1);
        System.out.print("Merged Array 1: ");
        for (int num : nums1_1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array (nums1)

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
