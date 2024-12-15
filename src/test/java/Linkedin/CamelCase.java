package Linkedin;

public class CamelCase {
    public static void main(String[] args) {
        String str = "Here comes the garden";//hereComesTheGarden
        String[] arr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append(arr[i].toLowerCase());
            } else
                sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1));
        }
        System.out.println(sb);
    }
}
