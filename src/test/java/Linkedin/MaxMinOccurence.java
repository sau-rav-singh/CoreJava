package Linkedin;

public class MaxMinOccurence {
//Get max and min occurrences of given String: Teeeessst Autoooooomationn
// output: m-1 and o-8

    public static void main(String[] args) {
        maxMinOccurence();
    }

    static void maxMinOccurence() {
        int[] counter = new int[256];
        for (char c : "TeeeessstAutooooooomationn".toCharArray()) {
            counter[c]++;
        }

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                maxChar = (char) i;
            }
            if (counter[i] >= 1 && counter[i] < minCount) {
                minCount = counter[i];
                minChar = (char) i;
            }
        }
        System.out.println(maxChar + ": " + maxCount);
        System.out.println(minChar + ": " + minCount);
    }
}