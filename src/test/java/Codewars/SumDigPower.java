package Codewars;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    //8^1+9^2=89

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,100));
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();

        for (long i = a; i <= b; i++) {
            if (isEureka(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isEureka(long num) {
        long temp=num;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=num;
        long result=0;
        for(int i=count;i>0;i--){
            long mod=temp%10;
            result+= (long) Math.pow(mod,i);
            temp/=10;
        }
        return result==num;
    }
}
