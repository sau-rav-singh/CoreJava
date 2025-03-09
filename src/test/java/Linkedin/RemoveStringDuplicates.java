package Linkedin;

public class RemoveStringDuplicates {
    public static String removeDuplicates(String str) {
        boolean[] visited = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String result = removeDuplicates(str);
        System.out.println(result); // Output: geksfor
    }
}