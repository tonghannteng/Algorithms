//  868. Binary Gap

class BinaryGap {

    public int binaryGap(int N) {
        char[] binary = Integer.toBinaryString(N).toCharArray();
        int result = 0;
        int count = 0;
        boolean initialOne = false;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == '0' && initialOne) {
                count++;
            } else {
                if (initialOne) {
                    count++;
                    result = Math.max(result, count);
                    count = 0;
                } else {
                    initialOne = true;
                }
            }
        }
        return result;
    }
}