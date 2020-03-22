//  1390. Four Divisors

class FourDivisors {

    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int sum = 0;
            int count = 0;
            for (int j = 1; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    sum += j;
                    count++;
                    if (num / j != j) {
                        sum += num / j;
                        count++;
                    }
                }
            }
            if (count == 4) {
                result+= sum;
            }
        }
        return result;
    }
}