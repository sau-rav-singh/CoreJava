package Linkedin;

public class StringCompression {
    //string concatination :
    // Input: aaabbbacfwww
    // Output: a3b3acfw3
    //Time Complexity: O(n)
    //Space Complexity: O(n)

    public static void main(String[] args) {
        {
            String str = "aaabbbacfwwwj";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int count = 1;
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
            }
            System.out.println(sb);
        }
    }
}
