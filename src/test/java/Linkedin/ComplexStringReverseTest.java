package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexStringReverseTest {

    @Test
    public void test(){
        Assert.assertEquals(reverseString("this is a phone"),"enoh pa s isiht");
    }

    public static String reverseString(String str) {
        char[] inputArray = str.toCharArray();
        StringBuilder sb=new StringBuilder();
        List<Integer> spaceList=new ArrayList<>();
        for(int i=inputArray.length-1;i>=0;i--){
            if(inputArray[i]!=' '){
                sb.append(inputArray[i]);
            }else{
                spaceList.add(i);
            }
        }
        Collections.sort(spaceList);
        for(int i:spaceList){
            sb.insert(i," ");
        }
        return sb.toString();
    }
}
