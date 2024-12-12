package Linkedin;

import java.util.*;
import java.util.stream.Collectors;

public class DictionaryExample {
    public static void main(String[] args) {
        Dictionary<Integer,Integer> dict=new Hashtable<>();
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
        for(Integer i:list){
            if(dict.get(i)!=null){
                dict.put(i,dict.get(i)+1);
            }else{
                dict.put(i,1);
            }
        }
        System.out.println(dict);

        Map<Integer,Integer> listToMap=list.stream().collect(Collectors.toMap(val->val,val->val*val));
        System.out.println(listToMap);
    }
}
