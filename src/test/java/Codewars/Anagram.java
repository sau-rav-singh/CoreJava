package Codewars;

import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("exOPgXxRbyFqJfT","JXyBfrxEFpXqGot"));
    }

    public static boolean isAnagram(String a, String b) {
        Map<Character,Integer> map_A=stringToMap(a);
        Map<Character,Integer> map_b=stringToMap(b);
        return map_A.equals(map_b);
    }

    public static Map<Character, Integer> stringToMap(String str){
        Map<Character,Integer> result=new LinkedHashMap<>();
        for(Character c:str.toLowerCase().toCharArray()){
            result.put(c, result.getOrDefault(c,0)+1);
        }
        return result;
    }
}
