package Linkedin;

public class CharsRepeatedTwice {
    public static void main(String[] args) {
        String str = "aabccdad";//a,c,d
        int[] counter=new int[26];
        for(char c:str.toCharArray()){
            counter[c-'a']++;
        }
        for(int i=0;i<counter.length;i++){
            if(counter[i]>=2){
                System.out.println((char)(i+'a')+" : "+counter[i]);
            }
        }
    }
}