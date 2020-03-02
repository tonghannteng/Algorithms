//  941. Valid Mountain Array

class ValidMountainArray {

    public boolean validMountainArray(int[] A) {
        if (A.length == 1 || A.length == 2) return false;
        int countUp = 0;
        int countDown = 0;
        boolean up = true;
        boolean down = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[0] >= A[1]) {
                return false;
            }
            if (A[i] <= A[i + 1] && up) {
                countUp++;
                up = false;
                down = true;
            } else if (A[i] >= A[i + 1] && down) {
                countDown++;
                down = false;
                up = true;
            }
            if (A[i] == A[i+1]) {
                return false;
            }

        }
        return countDown == 1 && countUp == 1;
    }
}