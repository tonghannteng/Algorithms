//  1342. Number of Steps to Reduce a Number to Zero

class NumberStepsReduceNumberZero {

    public int numberOfSteps (int num) {
        int result = 0;
        while (num != 0) {
            if (num%2 == 0) {
                num = num/2;
            } else {
                num = num -1;
            }
            result++;
        }
        return result;
    }
}