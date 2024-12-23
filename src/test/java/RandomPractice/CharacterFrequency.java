package RandomPractice;

public class CharacterFrequency {
    static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        String str = "Amazon is a company";
        int[] counter = new int[256];

        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println((char) i + ":" + counter[i]);
            }
        }
    }
}
