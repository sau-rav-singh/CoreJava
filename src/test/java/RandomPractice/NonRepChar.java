package RandomPractice;

public class NonRepChar {
    // Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
    public static void main(String[] args) {
        //Explanation: ‘f’ is the first character in the string which does not repeat.
        System.out.println(nonRepChar("geeksforgeeks"));
    }

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public static int nonRepChar(String s) {
        int[] counter = new int[26];
        for(Character ch:s.toCharArray()){
            counter[ch-'a']++;
        }
        int index=-1;
        for(int i=0;i< counter.length;i++){
            if(counter[i]==1){
                index=i;
                int i1 = i + 97;
                System.out.println((char)i1);
                break;
            }
        }
        return index;
    }
}