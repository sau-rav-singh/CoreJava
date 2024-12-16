package Linkedin;

public class ElementFrequency {
    //Time:O(n2)
    //Space:O(n)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 44};
        int[] counter = new int[arr.length];
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        counter[i]++;
                        visited[j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = counter[i] + 1;
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }

    }
}
