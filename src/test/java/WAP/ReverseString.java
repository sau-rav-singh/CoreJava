package WAP;

public class ReverseString {
//𝐈𝐧𝐩𝐮𝐭:
//"India is my country"
//𝐎𝐮𝐭𝐩𝐮𝐭:
//"yrtnuoc ym si aidnI"
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
