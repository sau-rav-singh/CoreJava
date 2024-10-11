package CodewarsSimple;

import static org.testng.Assert.assertEquals;

public class FakeBinary {

    //Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

    public static void main(String[] args) {
        assertEquals("01011110001100111", fakeBin("45385593107843568"));
    }

    public static String fakeBin(String numberString) {
        StringBuilder result=new StringBuilder();
        char[] arr = numberString.toCharArray();
        for (int digit : arr) {
            if (Character.getNumericValue(digit) < 5) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }
}
