package Linkedin;

public class ReverseStringWithoutSpecialChars {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

       return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "a!b?c";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr); // Output: c?b!a
    }
}