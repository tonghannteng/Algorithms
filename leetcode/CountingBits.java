//  338. Counting Bits

class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = countBit(i);
        }
        return result;
    }

    static int countBit(int num) {
        int r = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                r++;
            }
            num /= 2;
        }
        return r;
    }
}