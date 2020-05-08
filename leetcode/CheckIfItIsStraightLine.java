//  1232. Check If It Is a Straight Line

class CheckIfItIsStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        //        (y2 - y1)(x3 - x1) == (x2 - x1)(y3 - y1)
        int[] a = coordinates[0];
        int[] b = coordinates[1];
        int ax = a[0];
        int ay = a[1];
        int bx = b[0];
        int by = b[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] current = coordinates[i];
            int cx = current[0];
            int cy = current[1];
            if ((by - ay) * (cx - ax) != (bx - ax) * (cy - ay)) return false;
        }
        return true;
    }
}