package Linkedin;

public class ReverseString {
// QUESTION: Given a string, reverse each word in the string while maintaining the original order of words.
// Example: Input: "India is my country" -> Output: "aidnI si ym yrtnuoc"
    public static void main(String[] args) {
        //Space/Time: O(n*m)
        String str="India is my country";
        String[] arr=str.split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            char[] wordArray=arr[i].toCharArray();
            for(int j=wordArray.length-1;j>=0;j--){
                result.append(wordArray[j]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}
