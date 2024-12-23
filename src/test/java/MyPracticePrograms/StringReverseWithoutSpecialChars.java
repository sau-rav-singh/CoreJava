package MyPracticePrograms;

public class StringReverseWithoutSpecialChars {
    public static void main(String[] args) {
        String str = "autom@t@ion";//= “noitm@o@tua
        char[] arr = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[j])) {
                char temp = str.charAt(i);
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (Character.isSpaceChar(arr[i]))
                    i++;
                else
                    j--;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
