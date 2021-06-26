//  1822. Sign of the Product of an Array

class SignProductArray {

    public int arraySign(int[] nums) {
        int c = 0;
        for(int n: nums) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                c++;
            }
        }
        if (c % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}