//  1037. Valid Boomerang

class ValidBoomerang {

    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0] - points[1][0];
        int y1 = points[1][1] - points[2][1];
        int x2 = points[1][0] - points[2][0];
        int y2 = points[0][1] - points[1][1];
        return (x1 * y1 - x2 * y2) != 0;
    }
}