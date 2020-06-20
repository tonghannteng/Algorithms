//  1044. Longest Duplicate Substring

class LongestDuplicateSubstring {

    public String longestDupSubstring(String S) {
        int left = 1, right = S.length();
        long mod = Long.MAX_VALUE / 26;
        String ans = "";
        while (left <= right) {
            Set<Long> set = new HashSet<>();
            int mid = left + (right - left) / 2, flag = 0;
            long hash = 0, p = 1;
            for (int i = 0; i < mid; i++) {
                hash = (26 * hash + (S.charAt(i) - 'a')) % mod;
                p = (p * 26) % mod;
            }
            set.add(hash);
            for (int i = 0; i + mid < S.length(); i++) {
                hash = (hash * 26 + (S.charAt(i + mid) - 'a') - ((S.charAt(i) - 'a') * p)) % mod;
                if (hash < 0) hash += mod;
                if (set.contains(hash)) {
                    flag = 1;
                    ans = S.substring(i + 1, i + mid + 1);
                    break;
                }
                set.add(hash);
            }
            if (flag == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

}