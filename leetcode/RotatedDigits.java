//  788. Rotated Digits

class RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (checkGoodNumber(i) && checkRotate(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean checkGoodNumber(int num) {
        while (num > 0) {
            int c = num % 10;
            if (c == 2 || c == 5 || c == 6 || c == 9) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public boolean checkRotate(int num) {
        while (num > 0) {
            int c = num % 10;
            if (c == 3 || c == 7 || c == 4) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}