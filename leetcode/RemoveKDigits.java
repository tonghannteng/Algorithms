//  402. Remove K Digits

class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder bf = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int j = 0;
            while (j < bf.length() - 1 && bf.charAt(j) <= bf.charAt(j + 1)) {
                j++;
            }
            bf.delete(j, j + 1);
        }
        while (bf.length() > 1 && bf.charAt(0) == '0') {
            bf.delete(0, 1);
        }
        if (bf.length() == 0) {
            return "0";
        }
        return bf.toString();
    }
}