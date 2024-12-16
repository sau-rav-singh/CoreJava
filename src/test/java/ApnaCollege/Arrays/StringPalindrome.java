package ApnaCollege.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="racecar";
        int i=0,j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;j--;
        }
        System.out.println(flag);
    }
}
