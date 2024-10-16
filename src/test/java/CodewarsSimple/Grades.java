package CodewarsSimple;

import org.testng.Assert;

public class Grades {
    //Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

    public static void main(String[] args) {
        Assert.assertEquals(getGrade(95, 90, 93), 'A');
    }

    public static char getGrade(int s1, int s2, int s3) {
        double average = (s1 + s2 + s3) / 3.0; // Division by 3.0 ensures double precision
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
