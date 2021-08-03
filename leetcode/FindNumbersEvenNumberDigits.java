//  1295. Find Numbers with Even Number of Digits

class FindNumbersEvenNumberDigits {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num: nums) {
            if (countDigit(num) % 2 == 0 ) {
                result++;
            }
        }
        return result;
    }

    private int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }
}