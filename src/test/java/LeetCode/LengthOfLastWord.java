package LeetCode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        String[] splitStrings=s.split("\\s+");
        int len=splitStrings.length-1;
        return splitStrings[len].length();
    }
}
