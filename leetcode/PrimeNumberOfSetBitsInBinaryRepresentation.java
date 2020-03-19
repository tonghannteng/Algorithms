//  762. prime-number-of-set-bits-in-binary-representation

class PrimeNumberOfSetBitsInBinaryRepresentation {

    public int countPrimeSetBits(int L, int R) {
        String binary;
        int result = 0;
        for (int i = L; i <= R; i++) {
            binary = Integer.toString(i, 2);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') count++;
            }
            if (checkIsPrime(count)) result++;
        }
        return result;
    }

    private boolean checkIsPrime(int num) {
        if (num == 2) return true;
        else if (num <= 1 || num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}