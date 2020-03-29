//  693. Binary Number with Alternating Bits

class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length() - 1; ++i) {
            if (binary.charAt(i) == binary.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}