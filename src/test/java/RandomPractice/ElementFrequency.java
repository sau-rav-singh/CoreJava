package RandomPractice;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4};
        int[] counter = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (counter[j] != -1 && arr[i] == arr[j]) {
                    counter[i]++;
                    counter[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (counter[i] != -1) {
                System.out.println("Count of " + arr[i] + ": " + ++counter[i]);
            }
        }
    }
}
