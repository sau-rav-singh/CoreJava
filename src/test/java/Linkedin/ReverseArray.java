package Linkedin;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
