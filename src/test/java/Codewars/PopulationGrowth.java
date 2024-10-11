package Codewars;

import static org.testng.AssertJUnit.assertEquals;

public class PopulationGrowth {
    //In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?

    public static void main(String[] args) {
        assertEquals(3, nbYear(1000, 2, 50, 1200));

    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += (int) (p0 * (percent / 100)) + aug;
            years++;
        }
        return years;
    }
}
