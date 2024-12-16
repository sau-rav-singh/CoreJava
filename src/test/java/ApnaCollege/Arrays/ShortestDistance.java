package ApnaCollege.Arrays;

public class ShortestDistance {

    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        double shortestDistance = getShortestPath(directions);
        System.out.println("Shortest Distance is  " + shortestDistance);
    }

    static double getShortestPath(String path) {
        int x = 0, y = 0;

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }
return Math.sqrt((x*x)+(y*y));
    }
}
