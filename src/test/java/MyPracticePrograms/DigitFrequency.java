package MyPracticePrograms;

public class DigitFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 44};
        int[] counter = new int[arr.length];
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        counter[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                System.out.println(arr[i] + " : " + ++counter[i]);
            }
        }
    }
}
