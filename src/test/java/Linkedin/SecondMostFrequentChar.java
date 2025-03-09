package Linkedin;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String name = "banana";
        char[] arr = name.toCharArray();
        int[] counter = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int loopCount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    loopCount++;
                    counter[j] = -1;
                }
            }
            if (counter[i] != -1) {
                counter[i] = loopCount;
            }
        }

        int largest = 0;
        int secLar = 0;

        for (int i = 0; i < arr.length; i++) {
            if (counter[i] > counter[largest]) {
                secLar = largest;
                largest = i;
            } else if (counter[i] > counter[secLar] && counter[i] != counter[largest]) {
                secLar = i;
            }
        }

        System.out.println("Second most frequent character: " + arr[secLar]);
    }
}
