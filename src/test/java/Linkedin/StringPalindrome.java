package Linkedin;

public class StringPalindrome {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static void main(String[] args) {
        String name="Nitin";
        StringBuilder sb=new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            sb.append(name.toLowerCase().charAt(i));
        }
        boolean ans=name.toLowerCase().contentEquals(sb);
        System.out.println(ans);
    }
}
