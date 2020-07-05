//  461. Hamming Distance

class HammingDistance {

    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        String xx = String.format("%0" + (32 - x1.length()) + "d%s", 0, x1);
        String yy = String.format("%0" + (32 - y1.length()) + "d%s", 0, y1);
        int count = 0;
        for (int i = 0; i < xx.length(); i++) {
            if (xx.charAt(i) != yy.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}